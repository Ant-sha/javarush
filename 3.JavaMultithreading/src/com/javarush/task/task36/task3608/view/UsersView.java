package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public class UsersView implements  View{
   private  Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        if (modelData.isDisplayDeletedUserList()) {
            System.out.println("All deleted users:");
        } else {
            System.out.println("All users:");
        }
        for (User tmpusr : modelData.getUsers()) {
            System.out.println("\t"+tmpusr.toString());
        }
        System.out.println("===================================================");
    }
        /*System.out.println("All users:");
        List list= modelData.getUsers();
        for (int i = 0; i <list.size() ; i++) {
             System.out.println("\t"+list.get(i));

        }*/
        //for(User u: modelData.getUsers()) System.out.println();
        //modelData.getUsers().forEach(e -> System.out.println("\t" + e));
       
       // System.out.println("===================================================");

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }



    public void fireEventShowDeletedUsers(){
        controller.onShowAllDeletedUsers();
    }
    @Override
    public void setController(Controller controller) {
           this.controller=controller;
    }


    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }

}
