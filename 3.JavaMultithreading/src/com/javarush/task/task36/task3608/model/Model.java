package com.javarush.task.task36.task3608.model;

public interface Model {
    ModelData getModelData();

    public void loadDeletedUsers();
    public void loadUserById(long id);
    public void loadUsers();
    public void changeUserData(String name, long id, int level);


    public void deleteUserById(long id);
}
