package com.digitalhouse.blog.repository;

import com.digitalhouse.blog.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository <PostModel, Long> {
    public List<PostModel> findAllByTituloContainingIgnoreCase(String titulo);
}
