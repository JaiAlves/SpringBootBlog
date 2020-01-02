package br.com.sistemasja.blog.repository;

import org.springframework.stereotype.Repository;

import br.com.sistemasja.blog.model.Post;

@Repository
public interface PostRepository extends PostRepositotyMokJPA<Post, Long> {
	
}
