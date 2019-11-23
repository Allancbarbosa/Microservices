package com.example.fly.voo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VooService {

	@Autowired
	private VooRepository vooRepository;

	public List<VooDtoSaida> listar() {

		List<VooDtoSaida> lista = null;

		List<Voo> listaVoo = vooRepository.findAll();
		for (Voo voo : listaVoo) {
			if (lista == null) {
				lista = new ArrayList<VooDtoSaida>();
			}

			VooDtoSaida vooDtoSaida = new VooDtoSaida(voo);
			lista.add(vooDtoSaida);
		}

		return lista;

	}

	public VooDtoSaida buscar(Long codreserva) {
		VooDtoSaida vooDtoSaida = null;
		Optional<Voo> VooOptional = vooRepository.findById(codreserva);
		if (VooOptional.isPresent()) {
			Voo voo = VooOptional.get();
			vooDtoSaida = new VooDtoSaida(voo);
		}
		return vooDtoSaida;
	}

	public VooDtoSaida adicionar(VooDtoEntrada vooDtoEntrda) {
		VooDtoSaida vooDtoSaida = null;

		Voo voo = new Voo();
		
		voo.setCodcli(vooDtoEntrda.getCodcli());
		voo.setDestino(vooDtoEntrda.getDestino());
		voo.setDthrsaida(vooDtoEntrda.getDthrsaida());
		voo.setOrigem(vooDtoEntrda.getOrigem());
		voo.setPreco(vooDtoEntrda.getPreco());
		
		Voo vooSalva = vooRepository.save(voo);
		if (vooSalva != null) {
			vooDtoSaida = new VooDtoSaida(vooSalva);
		}

		return vooDtoSaida;
	}

	public VooDtoSaida alterar(VooDtoEntrada vooDtoEntrda, Long id) {
		VooDtoSaida vooDtoSaida = null;

		Optional<Voo> vooOptional = vooRepository.findById(id);
		if (vooOptional.isPresent()) {
			Voo voo = vooOptional.get();
			voo.setCodcli(vooDtoEntrda.getCodcli());
			voo.setDestino(vooDtoEntrda.getDestino());
			voo.setDthrsaida(vooDtoEntrda.getDthrsaida());
			voo.setOrigem(vooDtoEntrda.getOrigem());
			voo.setPreco(vooDtoEntrda.getPreco());		
			Voo vooSalva = vooRepository.save(voo);
			if (vooSalva != null) {
				vooDtoSaida = new VooDtoSaida(vooSalva);
			}
		}

		return vooDtoSaida;
	}

	public void excluir(Long id) {
		vooRepository.deleteById(id);
	}

}
