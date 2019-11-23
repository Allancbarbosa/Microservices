package com.example.carro.Carro;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carro.Carro.Carro;
import com.example.carro.Carro.CarroDtoEntrada;
import com.example.carro.Carro.CarrolDtoSaida;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	public List<CarrolDtoSaida> listar() {

		List<CarrolDtoSaida> lista = null;

		List<Carro> listaCarro = carroRepository.findAll();
		for (Carro carro : listaCarro) {
			if (lista == null) {
				lista = new ArrayList<CarrolDtoSaida>();
			}

			CarrolDtoSaida carroDtoSaida = new CarrolDtoSaida(carro);
			lista.add(carroDtoSaida);
		}

		return lista;

	}
	
	public CarrolDtoSaida buscar(Long codReservaCarro) {
		CarrolDtoSaida carroDtoSaida = null;
		Optional<Carro> carroOptional = carroRepository.findById(codReservaCarro);
		if(carroOptional.isPresent()) {
			Carro carro = carroOptional.get();
			carroDtoSaida = new CarrolDtoSaida(carro);
		}
		return carroDtoSaida;
	}
	
	public CarrolDtoSaida adicionar(CarroDtoEntrada carroDtoEntrda) {
		CarrolDtoSaida carroDtoSaida = null;
		
		Carro carro = new Carro();
		carro.setCodcli(carroDtoEntrda.getCodcli());
		carro.setFim(carroDtoEntrda.getFim());
		carro.setInicio(carroDtoEntrda.getInicio());
		carro.setModelo(carroDtoEntrda.getModelo());
		carro.setPreco(carroDtoEntrda.getPreco());
		
		Carro carrolSalva = carroRepository.save(carro);
		if(carrolSalva != null) {
			carroDtoSaida = new CarrolDtoSaida(carrolSalva);
		}
		
		return carroDtoSaida;
	}
	
	public CarrolDtoSaida alterar(CarroDtoEntrada carroDtoEntrda, Long codReservaCarro) {
		CarrolDtoSaida carroDtoSaida = null;
		
		Optional<Carro> carroOptional = carroRepository.findById(codReservaCarro);
		if(carroOptional.isPresent()) {
			Carro carro = carroOptional.get();
			carro.setCodcli(carroDtoEntrda.getCodcli());
			carro.setFim(carroDtoEntrda.getFim());
			carro.setInicio(carroDtoEntrda.getInicio());
			carro.setModelo(carroDtoEntrda.getModelo());
			carro.setPreco(carroDtoEntrda.getPreco());
			Carro carroSalva = carroRepository.save(carro);
			if(carroSalva != null) {
				carroDtoSaida = new CarrolDtoSaida(carroSalva);
			}
		}
		
		return carroDtoSaida;
	}
	
	public void excluir(Long codReservaCarro) {
		carroRepository.deleteById(codReservaCarro);
	}
	

}
