package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;


public class FakeModel extends  Exception implements Model  {
    private ModelData modelData = new ModelData();
    private Object UnsupportedOperationException;

    @Override
    public ModelData getModelData() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUsers() {

        List<User> list = new ArrayList<>();

        list.add(new User("A", 1, 1));
        list.add(new User("B", 2, 1));
        getModelData().setUsers(list);
        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }
    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void loadUserById(long id) {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));
        modelData.setUsers(users);
        throw new UnsupportedOperationException();
    }
}
