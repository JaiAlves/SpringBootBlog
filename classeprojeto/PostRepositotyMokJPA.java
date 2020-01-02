package br.com.sistemasja.blog.repository;

import java.util.List;

//import org.springframework.data.repository.NoRepositoryBean;
//
//@NoRepositoryBean
public interface PostRepositotyMokJPA <Post, Long>{
	
	public List<Post> findAll();
	
	public Post findOne(Long id);
	
	public Post save(Post post);
	
	public void delete(Long id);

}
