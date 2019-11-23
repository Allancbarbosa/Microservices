package com.example.pagamento.Pagamento;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pagamento.Pagamento.Pagamento;
import com.example.pagamento.Pagamento.PagamentoDtoEntrada;
import com.example.pagamento.Pagamento.PagamentoDtoSaida;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository pgtoRepository;

	public List<PagamentoDtoSaida> listar() {

		List<PagamentoDtoSaida> lista = null;

		List<Pagamento> listaPgto = pgtoRepository.findAll();
		for (Pagamento pgto : listaPgto) {
			if (lista == null) {
				lista = new ArrayList<PagamentoDtoSaida>();
			}

			PagamentoDtoSaida pgtoDtoSaida = new PagamentoDtoSaida(pgto);
			lista.add(pgtoDtoSaida);
		}

		return lista;

	}
	
	public PagamentoDtoSaida buscar(Long codPagamento) {
		PagamentoDtoSaida pgtoDtoSaida = null;
		Optional<Pagamento> pgtoOptional = pgtoRepository.findById(codPagamento);
		if(pgtoOptional.isPresent()) {
			Pagamento pgto = pgtoOptional.get();
			pgtoDtoSaida = new PagamentoDtoSaida(pgto);
		}
		return pgtoDtoSaida;
	}
	
	public PagamentoDtoSaida adicionar(PagamentoDtoEntrada pgtoDtoEntrda) {
		PagamentoDtoSaida pgtoDtoSaida = null;
		
		Pagamento pgto = new Pagamento();
		pgto.setCodSeguranca(pgtoDtoEntrda.getCodSeguranca());
		pgto.setNrocartao(pgtoDtoEntrda.getNrocartao());
		pgto.setValidade(pgtoDtoEntrda.getValidade());
		pgto.setValorPagamento(pgtoDtoEntrda.getValorPagamento());
		
		Pagamento pgtoSalva = pgtoRepository.save(pgto);
		if(pgtoSalva != null) {
			pgtoDtoSaida = new PagamentoDtoSaida(pgtoSalva);
		}
		
		return pgtoDtoSaida;
	}
	
	public PagamentoDtoSaida alterar(PagamentoDtoEntrada pgtoDtoEntrda, Long codReservaCarro) {
		PagamentoDtoSaida pgtoDtoSaida = null;
		
		Optional<Pagamento> pgtoOptional = pgtoRepository.findById(codReservaCarro);
		if(pgtoOptional.isPresent()) {
			Pagamento pgto = pgtoOptional.get();
			pgto.setCodSeguranca(pgtoDtoEntrda.getCodSeguranca());
			pgto.setNrocartao(pgtoDtoEntrda.getNrocartao());
			pgto.setValidade(pgtoDtoEntrda.getValidade());
			pgto.setValorPagamento(pgtoDtoEntrda.getValorPagamento());
			Pagamento pgtoSalva = pgtoRepository.save(pgto);
			if(pgtoSalva != null) {
				pgtoDtoSaida = new PagamentoDtoSaida(pgtoSalva);
			}
		}
		
		return pgtoDtoSaida;
	}
	
	public void excluir(Long codPagamento) {
		pgtoRepository.deleteById(codPagamento);
	}
	

}
