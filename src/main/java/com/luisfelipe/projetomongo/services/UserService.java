package com.luisfelipe.projetomongo.services;

import com.luisfelipe.projetomongo.domain.User;
import com.luisfelipe.projetomongo.repository.UserRepository;
import com.luisfelipe.projetomongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(("Objeto não encontrado!")));
    }
}
