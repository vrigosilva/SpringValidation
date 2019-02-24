package br.com.viniciusrigo.springvalidation.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jogador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotNull
	@Size(max=10)
	private String name;
	
	@Email
	private String email;
	
	@NotNull
	private OrigemEnum origem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public OrigemEnum getOrigem() {
		return origem;
	}

	public void setOrigem(OrigemEnum origem) {
		this.origem = origem;
	}

	public Jogador(){}
	public Jogador(@NotNull @Size(max = 50) String name, @Email String email, @NotNull OrigemEnum origem) {
		super();
		this.name = name;
		this.email = email;
		this.origem = origem;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", name=" + name + ", email=" + email + ", origem=" + origem + "]";
	}


	
}
