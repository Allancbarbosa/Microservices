package com.example.hotel.Hotel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long codReservaHotel;	
	
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


	private long codcli;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FimEstadia == null) ? 0 : FimEstadia.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + (int) (codReservaHotel ^ (codReservaHotel >>> 32));
		result = prime * result + (int) (codcli ^ (codcli >>> 32));
		result = prime * result + ((inicioEstadia == null) ? 0 : inicioEstadia.hashCode());
		result = prime * result + ((nomeHotel == null) ? 0 : nomeHotel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (FimEstadia == null) {
			if (other.FimEstadia != null)
				return false;
		} else if (!FimEstadia.equals(other.FimEstadia))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (codReservaHotel != other.codReservaHotel)
			return false;
		if (codcli != other.codcli)
			return false;
		if (inicioEstadia == null) {
			if (other.inicioEstadia != null)
				return false;
		} else if (!inicioEstadia.equals(other.inicioEstadia))
			return false;
		if (nomeHotel == null) {
			if (other.nomeHotel != null)
				return false;
		} else if (!nomeHotel.equals(other.nomeHotel))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}


	private String cidade;
	private String nomeHotel;
	private String inicioEstadia;
	private String FimEstadia;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	private double preco;
	
	
	
		
}
