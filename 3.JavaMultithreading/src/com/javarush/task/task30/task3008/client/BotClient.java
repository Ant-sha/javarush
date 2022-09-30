/*package com.javarush.task.task30.task3008.client;


import java.io.IOException;

public class BotClient extends Client {
    public BotClient() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        BotClient bot = new BotClient();
        bot.run();
    }
        @Override
        protected SocketThread getSocketThread() {
            return new BotSocketThread();
        }

        @Override
        protected boolean shouldSendTextFromConsole() {
            return false;
        }

        protected String getUserName() {
           // String userName = String.format("date_bot_%d", (int) (Math.random()*100));
            //return userName;
            int n = (int) Math.random() * 100;
            String str = "date_bot_";
            return str + n;
        }

    public class BotSocketThread extends Thread {

    }
}
*/
package com.javarush.task.task30.task3008.client;


import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BotClient extends Client   {

    public BotClient() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        BotClient client = new BotClient();
        client.run();
    }

    @Override
    protected String getUserName() {
        //return String.format("date_bot_%d", (int) Math.random() * 100);
        int n = (int) (Math.random() * 100);
        String str = "date_bot_";
        return str + n;
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    public class BotSocketThread extends SocketThread   {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            try {
                BotClient.this.sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");

                super.clientMainLoop();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        @Override
        protected void processIncomingMessage(String message){
            ConsoleHelper.writeMessage(message);
           String [] tokens=message.split(": ");
            if(tokens.length!=2) return;
           String name=tokens[0];
           String text=tokens[1];


           String format=null;
           switch(text){
               case "дата":
                   format="d.MM.YYYY";
                   break;
               case "день":
                   format="d";
                   break;
               case "месяц":
                           format="MMMM";
                   break;
               case  "год":
                   format= "YYYY";
                   break;
               case "время" :
                   format="H:mm:ss";
                   break;
               case  "час" :
                   format="H";
                   break;
               case "минуты" :
                   format= "m";
                   break;
               case "секунды" :
                   format="s";
                   break;


           }
            if (format != null) {
                String time = new SimpleDateFormat(format).format(Calendar.getInstance().getTime());
//                sendTextMessage("Информация для " + name + ": " + time );
                BotClient.this.sendTextMessage("Информация для " + name + ": " + time );

            }








        }

    }
}
