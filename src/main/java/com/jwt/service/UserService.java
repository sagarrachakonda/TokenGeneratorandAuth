package com.jwt.service;

import com.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"John","John@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"brad","brad@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"hash","hash@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }
}
