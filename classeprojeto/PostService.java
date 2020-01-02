package br.com.sistemasja.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistemasja.blog.model.Post;
import br.com.sistemasja.blog.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public List<Post> findAll() {
		return repository.findAll();
	}
	
	public Post findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Post save(Post post) {
		//return repository.saveAndFlush(post);
		return repository.save(post);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
}