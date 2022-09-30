package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    private static class Handler extends Thread {
        Socket socket;


        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String userName = null;
            Message queryName = new Message(MessageType.NAME_REQUEST);
            connection.send(queryName);
            Message nameResponse = connection.receive();
            while (true) {
                if (nameResponse.getType() == MessageType.USER_NAME) {
                    userName = nameResponse.getData();
                    if (userName != null && !connectionMap.containsKey(userName) && !userName.equals("")) {
                        connectionMap.put(userName, connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED));
                    } else {
                        return serverHandshake(connection);
                    }
                } else {
                    return serverHandshake(connection);
                }
                break;
            }
            return userName;
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (String userName1 : connectionMap.keySet()) {
                if (!userName1.equals(userName)) {
                    Message userAddedMessage = new Message(MessageType.USER_ADDED, userName1);
                    connection.send(userAddedMessage);
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message received_message = connection.receive();
                if (received_message != null && received_message.getType() == MessageType.TEXT) {
                    String text = userName + ": " + received_message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, text));

                } else {
                    ConsoleHelper.writeMessage("Это не текст");
                }
            }
        }

        public void run() {
            ConsoleHelper.writeMessage("Установлено новое соединиение с адресом "+socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)){

                userName = serverHandshake(connection);
                Message userAddedMessage = new Message(MessageType.USER_ADDED, userName);
                sendBroadcastMessage(userAddedMessage);
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка: "+ e.getMessage());
            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    Message userRemovedMessage = new Message(MessageType.USER_REMOVED, userName);
                    sendBroadcastMessage(userRemovedMessage);
                }
                ConsoleHelper.writeMessage("Cоединиение с адресом " + socket.getRemoteSocketAddress() + " закрыто");
            }

        }

        public Handler(Socket socket) {
            this.socket = socket;
        }
    }

        public static void sendBroadcastMessage(Message message) {
            for (Connection connection : connectionMap.values()) {
                try {
                    connection.send(message);
                } catch (Exception e) {
                    ConsoleHelper.writeMessage("Не смогли отправить сообщение " + connection.getRemoteSocketAddress());
                }
            }
        }





        /*Requirements:
1. В классе Handler должен быть создан метод private void notifyUsers(Connection connection, String userName).
2. Метод notifyUsers() должен отправлять через connection сообщение о том, что был добавлен пользователь с именем name для каждого имени из connectionMap.
3. Метод notifyUsers() НЕ должен отправлять сообщение о добавлении пользователя, если имя пользователя совпадает со вторым параметром метода (userName).
       */

        private void notifyUsers(Connection connection, String userName) throws IOException, ClassNotFoundException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!entry.getKey().equalsIgnoreCase(userName)) {
                    Message message = new Message(MessageType.USER_ADDED, entry.getKey());
                    connection.send(message);
                }
            }
        }



    public static void main(String[] args) throws IOException {
        ConsoleHelper.writeMessage("Введите номер порта сервера:");
        int port = ConsoleHelper.readInt();

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            ConsoleHelper.writeMessage("Сервер запущен на порту " + port);
            while (true) {
                Handler handler = new Handler(serverSocket.accept());
                handler.start();
            }
        }catch (Exception e) {
            ConsoleHelper.writeMessage(e.getMessage());
        }
    }
}
