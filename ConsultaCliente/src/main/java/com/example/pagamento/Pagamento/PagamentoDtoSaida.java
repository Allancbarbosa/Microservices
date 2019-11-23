package com.example.pagamento.Pagamento;

public class PagamentoDtoSaida {
	
	public long getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(long codPagamento) {
		this.codPagamento = codPagamento;
	}

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

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	private long codPagamento;
	private long nrocartao;
	private int validade;
	private int codSeguranca;
	private double valorPagamento;


	public PagamentoDtoSaida(long codPagamento, long nrocartao, int validade, int codSeguranca, double valorPagamento) {
		this.codPagamento = codPagamento;
		this.nrocartao = nrocartao;
		this.validade = validade;
		this.codSeguranca = codSeguranca;
		this.valorPagamento = valorPagamento;

	}

	public PagamentoDtoSaida(Pagamento pgto) {
		this.codPagamento = pgto.getCodPagamento();
		this.nrocartao = pgto.getNrocartao();
		this.validade = pgto.getValidade();
		this.codSeguranca = pgto.getCodSeguranca();
		this.valorPagamento = pgto.getValorPagamento();
	}


}
