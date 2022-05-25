package com.luisfelipe.projetomongo.repository;

import com.luisfelipe.projetomongo.domain.Post;
import com.luisfelipe.projetomongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoringCase(String text);
}
