package com.example.carro.Carro;

public class CarrolDtoSaida {



	public long getCodReservaCarro() {
		return codReservaCarro;
	}

	public void setCodReservaCarro(long codReservaCarro) {
		this.codReservaCarro = codReservaCarro;
	}

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

	private long codReservaCarro;
	private long codcli;
	private String modelo;
	private String inicio;
	private String fim;
	private double preco;

	public CarrolDtoSaida(long codReservaCarro, long codcli, String modelo, String inicio, String fim,
		 double preco) {
		this.codReservaCarro = codReservaCarro;
		this.codcli = codcli;
		this.modelo = modelo;
		this.inicio = inicio;
		this.fim = fim;
		this.setPreco(preco);

	}

	public CarrolDtoSaida(Carro carro) {
		this.codReservaCarro = carro.getCodReservaCarro();
		this.codcli = carro.getCodcli();
		this.modelo = carro.getModelo();
		this.inicio = carro.getInicio();
		this.fim = carro.getFim();
		this.setPreco(carro.getPreco());
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
