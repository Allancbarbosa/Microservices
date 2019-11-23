package com.example.pagamento.Pagamento;

public class PagamentoDtoEntrada {

	public long getNrocartao() {
		return nrocartao;
	}

	public void setNrocartao(long nrocartao) {
		this.nrocartao = nrocartao;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public int getCodSeguranca() {
		return codSeguranca;
	}

	public void setCodSeguranca(int codSeguranca) {
		this.codSeguranca = codSeguranca;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(int valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	private long nrocartao;
	private int validade;
	private int codSeguranca;
	private double valorPagamento;

	public PagamentoDtoEntrada() {
	}

	public PagamentoDtoEntrada(long nrocartao, int validade, int codSeguranca, double valorPagamento) {
		this.nrocartao = nrocartao;
		this.validade = validade;
		this.codSeguranca = codSeguranca;
		this.valorPagamento = valorPagamento;

	}

}
