package br.com.viniciusrigo.springvalidation.exception;

import java.io.Serializable;

public class ErrorDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	private String campo;
	private String details;

	public ErrorDetails(String campo, String details) {
    super();
    this.campo = campo;
    this.details = details;
  }
}