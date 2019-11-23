package com.example.fly.voo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long codreserva;	
	
	private long codcli;
	private String origem;
	private String destino;
	private double preco;
	private String  dthrsaida;
	
	public long getCodreserva() {
		return codreserva;
	}
	public void setCodreserva(long codreserva) {
		this.codreserva = codreserva;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;	
		result = prime * result + (int) (codreserva ^ (codreserva >>> 32));
		result = prime * result + (int) (codcli ^ (codcli >>> 32));
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((dthrsaida == null) ? 0 : dthrsaida.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
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
		Voo other = (Voo) obj;
		if (codcli != other.codcli)
			return false;
		if (codreserva != other.codreserva)
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (dthrsaida == null) {
			if (other.dthrsaida != null)
				return false;
		} else if (!dthrsaida.equals(other.dthrsaida))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}

	
	


	
		
}
