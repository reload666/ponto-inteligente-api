package com.telefonica.pontointeligente.api.dto;

public class EmpresaDto {
	
	private Long id;
	private String RazaoSocial;
	private String cnpj;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "EmpresaDto [id=" + id + ", RazaoSocial=" + RazaoSocial + ", cnpj=" + cnpj + "]";
	}
	

}
