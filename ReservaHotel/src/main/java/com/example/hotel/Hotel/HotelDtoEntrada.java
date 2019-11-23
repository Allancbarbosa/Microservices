package com.example.hotel.Hotel;

public class HotelDtoEntrada {

	public long getCodcli() {
		return codcli;
	}

	public void setCodcli(long codcli) {
		this.codcli = codcli;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNomeHotel() {
		return nomeHotel;
	}

	public void setNomeHotel(String nomeHotel) {
		this.nomeHotel = nomeHotel;
	}

	public String getInicioEstadia() {
		return inicioEstadia;
	}

	public void setInicioEstadia(String inicioEstadia) {
		this.inicioEstadia = inicioEstadia;
	}

	public String getFimEstadia() {
		return FimEstadia;
	}

	public void setFimEstadia(String fimEstadia) {
		FimEstadia = fimEstadia;
	}

	private long codcli;
	private String cidade;
	private String nomeHotel;
	private String inicioEstadia;
	private String FimEstadia;
	private double preco;

	public HotelDtoEntrada() {
	}

	public HotelDtoEntrada(long codcli, String cidade, String nomeHotel, String inicioEstadia, String FimEstadia,
			double preco) {
		this.codcli = codcli;
		this.cidade = cidade;
		this.nomeHotel = nomeHotel;
		this.inicioEstadia = inicioEstadia;
		this.FimEstadia = FimEstadia;
		this.setPreco(preco);

	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
