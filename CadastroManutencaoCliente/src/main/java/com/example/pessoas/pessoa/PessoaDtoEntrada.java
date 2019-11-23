package com.example.pessoas.pessoa;

public class PessoaDtoEntrada {

	private String nome;
	private String endereco;
	private String profissao;
	private int dtnascimento;

	public String getEndereco() {
		return endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public int getDtnascimento() {
		return dtnascimento;
	}

	public String getNome() {
		return nome;
	}

	public PessoaDtoEntrada() {
	}

	public PessoaDtoEntrada(String nome, String endereco, String profissao, int dtnascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.profissao = profissao;
		this.dtnascimento = dtnascimento;
	}

}
