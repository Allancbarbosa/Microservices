package com.example.hotel.Hotel;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.Hotel.HotelDtoEntrada;
import com.example.hotel.Hotel.HotelDtoSaida;
import com.example.hotel.Hotel.Hotel;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	public List<HotelDtoSaida> listar() {

		List<HotelDtoSaida> lista = null;

		List<Hotel> listaHotel = hotelRepository.findAll();
		for (Hotel hotel : listaHotel) {
			if (lista == null) {
				lista = new ArrayList<HotelDtoSaida>();
			}

			HotelDtoSaida hotelDtoSaida = new HotelDtoSaida(hotel);
			lista.add(hotelDtoSaida);
		}

		return lista;

	}
	
	public HotelDtoSaida buscar(Long codReservaHotel) {
		HotelDtoSaida hotelDtoSaida = null;
		Optional<Hotel> hotelOptional = hotelRepository.findById(codReservaHotel);
		if(hotelOptional.isPresent()) {
			Hotel hotel = hotelOptional.get();
			hotelDtoSaida = new HotelDtoSaida(hotel);
		}
		return hotelDtoSaida;
	}
	
	public HotelDtoSaida adicionar(HotelDtoEntrada hotelDtoEntrda) {
		HotelDtoSaida hotelDtoSaida = null;
		
		Hotel hotel = new Hotel();
		hotel.setCidade(hotelDtoEntrda.getCidade());
		hotel.setCodcli(hotelDtoEntrda.getCodcli());
		hotel.setFimEstadia(hotelDtoEntrda.getFimEstadia());
		hotel.setInicioEstadia(hotelDtoEntrda.getInicioEstadia());
		hotel.setNomeHotel(hotelDtoEntrda.getNomeHotel());
		hotel.setPreco(hotelDtoEntrda.getPreco());
		
		Hotel hotelSalva = hotelRepository.save(hotel);
		if(hotelSalva != null) {
			hotelDtoSaida = new HotelDtoSaida(hotelSalva);
		}
		
		return hotelDtoSaida;
	}
	
	public HotelDtoSaida alterar(HotelDtoEntrada hotelDtoEntrda, Long codReservaHotel) {
		HotelDtoSaida hotelDtoSaida = null;
		
		Optional<Hotel> hotelOptional = hotelRepository.findById(codReservaHotel);
		if(hotelOptional.isPresent()) {
			Hotel hotel = hotelOptional.get();
			hotel.setCidade(hotelDtoEntrda.getCidade());
			hotel.setCodcli(hotelDtoEntrda.getCodcli());
			hotel.setFimEstadia(hotelDtoEntrda.getFimEstadia());
			hotel.setInicioEstadia(hotelDtoEntrda.getInicioEstadia());
			hotel.setNomeHotel(hotelDtoEntrda.getNomeHotel());
			hotel.setPreco(hotelDtoEntrda.getPreco());
			Hotel hotelSalva = hotelRepository.save(hotel);
			if(hotelSalva != null) {
				hotelDtoSaida = new HotelDtoSaida(hotelSalva);
			}
		}
		
		return hotelDtoSaida;
	}
	
	public void excluir(Long codReservaHotel) {
		hotelRepository.deleteById(codReservaHotel);
	}
	

}
