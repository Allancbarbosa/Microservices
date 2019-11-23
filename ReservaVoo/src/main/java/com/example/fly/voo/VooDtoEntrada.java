package com.example.fly.voo;


public class VooDtoEntrada {


	public long getCodcli() {
		return codcli;
	}

	public void setCodcli(long codcli) {
		this.codcli = codcli;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDthrsaida() {
		return dthrsaida;
	}

	public void setDthrsaida(String dthrsaida) {
		this.dthrsaida = dthrsaida;
	}

	private long codcli;
	private String origem;
	private String destino;
	private double preco;
	private String dthrsaida;
	

	public VooDtoEntrada() {
	}

	public VooDtoEntrada(long codcli, String origem, String destino, double preco,String dthrsaida) {
		this.codcli = codcli;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dthrsaida = dthrsaida;
		
		
	}

}
