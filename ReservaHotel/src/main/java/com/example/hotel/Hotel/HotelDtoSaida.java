package com.example.hotel.Hotel;

public class HotelDtoSaida {

	public long getCodReservaHotel() {
		return codReservaHotel;
	}

	public void setCodReservaHotel(long codReservaHotel) {
		this.codReservaHotel = codReservaHotel;
	}

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

	private long codReservaHotel;
	private long codcli;
	private String cidade;
	private String nomeHotel;
	private String inicioEstadia;
	private String FimEstadia;
	private double preco;

	public HotelDtoSaida(long codReservaHotel, long codcli, String cidade, String nomeHotel, String inicioEstadia,
			String FimEstadia, double preco) {
		this.codReservaHotel = codReservaHotel;
		this.codcli = codcli;
		this.cidade = cidade;
		this.nomeHotel = nomeHotel;
		this.inicioEstadia = inicioEstadia;
		this.FimEstadia = FimEstadia;
		this.setPreco(preco);

	}

	public HotelDtoSaida(Hotel hotel) {
		this.codReservaHotel = hotel.getCodReservaHotel();
		this.codcli = hotel.getCodcli();
		this.cidade = hotel.getCidade();
		this.nomeHotel = hotel.getNomeHotel();
		this.inicioEstadia = hotel.getInicioEstadia();
		this.FimEstadia = hotel.getFimEstadia();
		this.setPreco(hotel.getPreco());
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
