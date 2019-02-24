package br.com.viniciusrigo.springvalidation.exception;

public class BadRequestExceptiom extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String campo;
	private String mensage;
	public BadRequestExceptiom(String mensage, String campo) {
		super(mensage);
		this.campo = campo;
		this.mensage = mensage;
	}
	public String getCampo() {
		return campo;
	}
	public String getMensage() {
		return mensage;
	}


}
