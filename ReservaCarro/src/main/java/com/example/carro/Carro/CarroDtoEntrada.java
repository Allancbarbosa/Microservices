package com.example.carro.Carro;

public class CarroDtoEntrada {



	public long getCodcli() {
		return codcli;
	}

	public void setCodcli(long codcli) {
		this.codcli = codcli;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	private long codcli;
	private String modelo;
	private String inicio;
	private String fim;
	private double preco;

	public CarroDtoEntrada() {
	}

	public CarroDtoEntrada(long codcli, String modelo, String inicio, String fim,double preco) {
		this.codcli = codcli;
		this.modelo = modelo;
		this.inicio = inicio;
		this.fim = fim;
		this.setPreco(preco);

	}


}
