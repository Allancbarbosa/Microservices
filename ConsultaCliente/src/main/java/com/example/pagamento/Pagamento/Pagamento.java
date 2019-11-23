package com.example.pagamento.Pagamento;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private long codPagamento;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codPagamento ^ (codPagamento >>> 32));
		result = prime * result + codSeguranca;
		result = prime * result + (int) (nrocartao ^ (nrocartao >>> 32));
		result = prime * result + validade;
		long temp;
		temp = Double.doubleToLongBits(valorPagamento);
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
		Pagamento other = (Pagamento) obj;
		if (codPagamento != other.codPagamento)
			return false;
		if (codSeguranca != other.codSeguranca)
			return false;
		if (nrocartao != other.nrocartao)
			return false;
		if (validade != other.validade)
			return false;
		if (Double.doubleToLongBits(valorPagamento) != Double.doubleToLongBits(other.valorPagamento))
			return false;
		return true;
	}
	private long nrocartao;
	private int validade;
	private int codSeguranca;
	private double valorPagamento;
	


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

	
	
}
