package com.jwt.example.JwtExample3.service;

import com.jwt.example.JwtExample3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Gaurav","Gaurav@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Abhi","Abhi@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Sonu","Sonu@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"monu","monu@gmail.com"));
    }
    public List<User> getUsers()
    {
        return this.store;
    }
}
