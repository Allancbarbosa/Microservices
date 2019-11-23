package com.example.pessoas.pessoa;

public class PessoaDtoSaida {

	private Long id;
	private String nome;
	private String endereco;
	private String profissao;
	private int dtnascimento;
	
	public String getProfissao() {
		return profissao;
	}

	public int getDtnascimento() {
		return dtnascimento;
	}
	
	public PessoaDtoSaida(Long id, String nome,String endereco,String profissao,int dtnascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.profissao = profissao;
		this.dtnascimento = dtnascimento;
	}
	
	public PessoaDtoSaida(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.endereco = pessoa.getEndereco();
		this.profissao = pessoa.getProfissao();
		this.dtnascimento = pessoa.getDtnascimento();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}


}
