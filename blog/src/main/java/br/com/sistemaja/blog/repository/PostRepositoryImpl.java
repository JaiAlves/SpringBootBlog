package br.com.sistemasja.blog.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.sistemasja.blog.model.Post;

@Repository
public class PostRepositoryImpl implements PostRepository {
	
	private static List<Post> l = new ArrayList<Post>();
	private static Long ultimoId=0l;

	@Override
	public List<Post> findAll() {
		return l;
	}

	@Override
	public Post findOne(Long id) {
		for (Post p : findAll()) {
			if (p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Post save(Post post) {
		if (post.getId()!=null) {
			Post postAux = findOne(post.getId());
			
			//remove o objeto antigo da lista
			if (postAux!=null) {
				delete(postAux.getId());
			}
		}
		//adiciona o novo
		addNew(post);
		
		return post;
	}
	
	private void addNew(Post post) {
		if (post.getId()==null) {
			post.setId(getProxId());
		}
		l.add(post);
	}

	@Override
	public void delete(Long id) {
		l.remove(findOne(id));
		
	}
	
	private Long getProxId() {
		ultimoId= new Long(ultimoId.longValue()+1);
		
		return ultimoId;
	}
	
	public void refazLista() {
		l = new ArrayList<Post>();
		
		Post p1 = new Post();
		p1.setId(getProxId());
		p1.setAutor("Autor "+p1.getId());
		p1.setData(new Date());
		p1.setTexto("qq txt "+p1.getData().toGMTString());
		p1.setTitulo("Tit "+p1.getId());
		l.add(p1);
		
		Post p2 = new Post();
		p2.setId(getProxId());
		p2.setAutor("Autor "+p2.getId());
		p2.setData(new Date());
		p2.setTexto("qq txt "+p2.getData().toGMTString());
		p2.setTitulo("Tit "+p2.getId());
		l.add(p2);
		
		Post p3 = new Post();
		p3.setId(getProxId());
		p3.setAutor("Autor "+p3.getId());
		p3.setData(new Date());
		p3.setTexto("qq txt "+p3.getData().toGMTString());
		p3.setTitulo("Tit "+p3.getId());
		l.add(p3);		
	}
}
