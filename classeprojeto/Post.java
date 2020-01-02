package br.com.sistemasja.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Post implements Serializable {

	private static final long serialVersionUID = 1L;

	//@Id
	//@SequenceGenerator(name = "post_seq", sequenceName = "post_seq")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
	private Long id;
	
	//@Column(nullable = false, length = 50)
	//@NotBlank(message = "Autor é uma informação obrigatória.")
	private String autor;
	
	//@Column(nullable = false, length = 150)
	//@NotBlank(message = "Título é uma informação obrigatória.")
	private String titulo;
	
	//@Column(nullable = false, length = 2000)
	//@NotBlank(message = "Texto é uma informação obrigatória.")
	private String texto;
	
	//@Column(nullable = false)
	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@NotNull(message = "Data é uma informação obrigatória.")
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", autor=" + autor + ", titulo=" + titulo + ", texto=" + texto + ", data=" + data
				+ "]";
	}

}