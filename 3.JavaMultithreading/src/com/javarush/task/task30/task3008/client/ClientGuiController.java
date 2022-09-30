package com.javarush.task.task30.task3008.client;




import java.io.IOException;

public class ClientGuiController extends Client {
    private ClientGuiModel model=new ClientGuiModel();
    private ClientGuiView view=new ClientGuiView(this);

    public ClientGuiController() throws IOException {
    }

    // public ClientGuiController(Model model, JViewport view) throws IOException {
    //}

    public static void main(String[] args) throws IOException {
        ClientGuiController controller=new ClientGuiController();
        controller.run();
    }
    public class GuiSocketThread extends SocketThread{

       @Override
        protected void processIncomingMessage(String message){
            if(message.equals(null)){ return;}
                model.setNewMessage(message);
            view.refreshMessages();
            }

        @Override
        protected void informAboutAddingNewUser(String userName){
            model.addUser(userName);
            view.refreshUsers();

        }

        @Override
        protected void informAboutDeletingNewUser(String userName){
model.deleteUser(userName);
view.refreshUsers();
        }
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
super.notifyConnectionStatusChanged(clientConnected);
view.notifyConnectionStatusChanged(clientConnected);
        }


    }


    protected SocketThread getSocketThread(){
        return new GuiSocketThread();
    }
   public  void run(){
        getSocketThread().run();
    }

    @Override
    protected String getServerAddress() {
        return view.getServerAddress();
    }

    protected int getServerPort(){
        return view.getServerPort();
    }

protected String getUserName(){
        return view.getUserName();
}

public  ClientGuiModel getModel(){
        return model;
}

}
