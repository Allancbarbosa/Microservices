package com.example.hotel.Hotel;

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
@RequestMapping("/hotel")
public class HotelResource {

	@Autowired
	private HotelService hoteService;

	@GetMapping
	public List<HotelDtoSaida> listar() {
		return hoteService.listar();
	}

	@GetMapping("/{codReservaHotel}")
	public ResponseEntity<HotelDtoSaida> buscar(@PathVariable Long codReservaHotel) {
		
		
		HotelDtoSaida hotelDtoSaida = hoteService.buscar(codReservaHotel);
		if(hotelDtoSaida == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(hotelDtoSaida);
		}

	}

	@PostMapping
	public HotelDtoSaida adicionar(@RequestBody HotelDtoEntrada hotelDtoEntrada) {
		return hoteService.adicionar(hotelDtoEntrada);
	}

	@PutMapping("/{codReservaHotel}")
	public HotelDtoSaida adicionar(@RequestBody HotelDtoEntrada hotelDtoEntrada, @PathVariable Long codReservaHotel) {
		return hoteService.alterar(hotelDtoEntrada, codReservaHotel);
	}

	@DeleteMapping("/{codReservaHotel}")
	public void excliur(@PathVariable Long codReservaHotel) {
		hoteService.excluir(codReservaHotel);
	}

}
