package br.com.viniciusrigo.springvalidation.model;

public enum OrigemEnum{
	VINGADORES("1","Vingadores"), 
	LIGA("2","Liga da Justiça");

	private String descricao;
	private String codigo;
	
	OrigemEnum(String codigo, String descricao){
		this.descricao = descricao;
		this.codigo = codigo;
	}
	
	public String getDescricao(){
		return this.descricao;
	}

	public String getCodigo() {
		return codigo;
	}


}
