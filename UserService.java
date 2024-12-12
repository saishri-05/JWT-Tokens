package com.jwt_example.services;

import com.jwt_example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "sai shri", "saishri@example.com"));
        store.add(new User(UUID.randomUUID().toString(), "monisha", "monisha@example.com"));
        store.add(new User(UUID.randomUUID().toString(), "arun", "arun@example.com"));
        store.add(new User(UUID.randomUUID().toString(), "Harsh", "harsh@example.com"));
    }

    public List<User> getUsers() {

        return this.store;
    }
}
