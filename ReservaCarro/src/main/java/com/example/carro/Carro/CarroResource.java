package com.example.carro.Carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroResource {

	@Autowired
	private CarroService carroService;

	@GetMapping
	public List<CarrolDtoSaida> listar() {
		return carroService.listar();
	}

	@GetMapping("/{codReservaCarro}")
	public ResponseEntity<CarrolDtoSaida> buscar(@PathVariable Long codReservaCarro) {
		
		
		CarrolDtoSaida hotelDtoSaida = carroService.buscar(codReservaCarro);
		if(hotelDtoSaida == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(hotelDtoSaida);
		}

	}

	@PostMapping
	public CarrolDtoSaida adicionar(@RequestBody CarroDtoEntrada hotelDtoEntrada) {
		return carroService.adicionar(hotelDtoEntrada);
	}

	@PutMapping("/{codReservaCarro}")
	public CarrolDtoSaida adicionar(@RequestBody CarroDtoEntrada hotelDtoEntrada, @PathVariable Long codReservaCarro) {
		return carroService.alterar(hotelDtoEntrada, codReservaCarro);
	}

	@DeleteMapping("/{codReservaCarro}")
	public void excliur(@PathVariable Long codReservaCarro) {
		carroService.excluir(codReservaCarro);
	}

}
