package com.luisfelipe.projetomongo.services;

import com.luisfelipe.projetomongo.domain.User;
import com.luisfelipe.projetomongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
