package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;

    private volatile boolean clientConnected = false;

    public Client() throws IOException {
    }


    protected String getServerAddress() {
        ConsoleHelper.writeMessage("Введите адрес сервера:");

        String serveradress = ConsoleHelper.readString();
        return serveradress;
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Введите адрес порта сервера");
        int portServerAdress = ConsoleHelper.readInt();
        return portServerAdress;

    }

    protected String getUserName() {
        ConsoleHelper.writeMessage("Ваше имя:");
        String userName = ConsoleHelper.readString();
        return userName;

    }


    protected boolean shouldSendTextFromConsole() {
        return true;

    }


    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
//     if(sending|receiving
//      exception catched;){
//      clientConnected=false;
//     }
        try {
            Message message = new Message(MessageType.TEXT, text);
            connection.send(message);
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Не удалось отправить сообщение" + e.getMessage());
            clientConnected = false;
        }
        //, если во время отправки или создания сообщения возникло исключение IOException.
    }


    public void run() {
        Thread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        //ConsoleHelper.writeMessage("Установлено новое соединиение с адресом " + socket.getRemoteSocketAddress());
        //String userName = null;
        try {
            synchronized (this) {
                wait();

            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("программа завершила свою работу аварийно " + e.getMessage());
            System.exit(0);
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено.Для выхода наберите команду 'exit'.");
            String line = "";
            while (clientConnected && !(line = ConsoleHelper.readString()).equals("exit")) {
                if (shouldSendTextFromConsole())
                    sendTextMessage(line);
            }
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }
    }


    //userName = serverHandshake(connection);
    //Message userAddedMessage = new Message(MessageType.USER_ADDED, userName);
    //sendBroadcastMessage(userAddedMessage);
    //sendListOfUsers(connection, userName);
    //serverMainLoop(connection, userName);
            /*} catch(IOException | ClassNotFoundException e){
                ConsoleHelper.writeMessage("Ошибка: " + e.getMessage());
            } finally{
                if (userName != null) {
                    connectionMap.remove(userName);
                    Message userRemovedMessage = new Message(MessageType.USER_REMOVED, userName);
                    sendBroadcastMessage(userRemovedMessage);
                }
                ConsoleHelper.writeMessage("Cоединиение с адресом " + socket.getRemoteSocketAddress() + " закрыто");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }*/


    public class SocketThread extends Thread {
        @Override
        public void run() {
            super.run();
           /*1) Запроси адрес и порт сервера с помощью методов getServerAddress() и getServerPort().
2) Создай новый объект класса java.net.Socket, используя данные, полученные в предыдущем пункте.
3) Создай объект класса Connection, используя сокет из п.17.2.
4) Вызови метод, реализующий "рукопожатие" клиента с сервером (clientHandshake()).
5) Вызови метод, реализующий основной цикл обработки сообщений сервера.
6) При возникновении исключений IOException или ClassNotFoundException сообщи главному потоку о проблеме, используя notifyConnectionStatusChanged() и false в качестве параметра.

Клиент готов, можешь запустить сервер, несколько клиентов и проверить как все работает. getServerAddress() и getServerPort().
        */
       String servAdress=getServerAddress();
        int port =getServerPort();
            Socket socket = null;

            try {
                 socket=new Socket(servAdress, port);
                Connection connection= new Connection(socket);
                Client.this.connection= connection;
                    clientHandshake();
                    clientMainLoop();
                } catch (ClassNotFoundException e){
                    e.printStackTrace();
                    notifyConnectionStatusChanged(false);
                }catch(IOException e){
                e.printStackTrace();
                notifyConnectionStatusChanged(false);
            }





        }


        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);

        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(String.format("%s joined the chat.", userName));
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(String.format("%s leaved the chat. ", userName));

        }
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            synchronized (Client.this)
            {
                Client.this.clientConnected=clientConnected;
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException{
            while (true){
                Message message=connection.receive();

                if (message.getType() == MessageType.NAME_REQUEST) {
                    String userName = getUserName();
                    connection.send(new Message(MessageType.USER_NAME, userName));}
                    else if(message.getType()==MessageType.NAME_ACCEPTED){
                    notifyConnectionStatusChanged(true);
                    break;
                }

               else  throw new IOException("Unexpected MessageType");


            }


        }

        protected void  clientMainLoop() throws IOException, ClassNotFoundException{

            while (true){
                Message message=connection.receive();

                if(message.getType()==MessageType.TEXT){
                    processIncomingMessage(message.getData());
                } else if(message.getType()==MessageType.USER_ADDED){
                    informAboutAddingNewUser(message.getData());
                }
                else if(message.getType()==MessageType.USER_REMOVED){
                    informAboutDeletingNewUser(message.getData());
                }
                else  throw new IOException("Unexpected MessageType");


            }

        }

    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
        client.run();
    }

}
















