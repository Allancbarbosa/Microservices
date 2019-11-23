package com.example.fly.voo;

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
@RequestMapping("/voo")
public class VooResource {

	@Autowired
	private VooService vooService;

	@GetMapping
	public List<VooDtoSaida> listar() {
		return vooService.listar();
	}

	@GetMapping("/{codreserva}")
	public ResponseEntity<VooDtoSaida> buscar(@PathVariable Long codreserva) {
		
		
		VooDtoSaida vooDtoSaida = vooService.buscar(codreserva);
		if(vooDtoSaida == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(vooDtoSaida);
		}

	}

	@PostMapping
	public VooDtoSaida adicionar(@RequestBody VooDtoEntrada vooDtoEntrada) {
		return vooService.adicionar(vooDtoEntrada);
	}

	@PutMapping("/{codreserva}")
	public VooDtoSaida adicionar(@RequestBody VooDtoEntrada vooDtoEntrada, @PathVariable Long codreserva) {
		return vooService.alterar(vooDtoEntrada, codreserva);
	}

	@DeleteMapping("/{codreserva}")
	public void excliur(@PathVariable Long codreserva) {
		vooService.excluir(codreserva);
	}

}
