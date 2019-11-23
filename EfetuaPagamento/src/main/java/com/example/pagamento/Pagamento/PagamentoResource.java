package com.example.pagamento.Pagamento;

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
@RequestMapping("/pagamento")
public class PagamentoResource {

	@Autowired
	private PagamentoService pgtoService;

	@GetMapping
	public List<PagamentoDtoSaida> listar() {
		return pgtoService.listar();
	}

	@GetMapping("/{codPagamento}")
	public ResponseEntity<PagamentoDtoSaida> buscar(@PathVariable Long codPagamento) {
		
		
		PagamentoDtoSaida pgtoDtoSaida = pgtoService.buscar(codPagamento);
		if(pgtoDtoSaida == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(pgtoDtoSaida);
		}

	}

	@PostMapping
	public PagamentoDtoSaida adicionar(@RequestBody PagamentoDtoEntrada pgtoDtoEntrada) {
		return pgtoService.adicionar(pgtoDtoEntrada);
	}

	@PutMapping("/{codPagamento}")
	public PagamentoDtoSaida adicionar(@RequestBody PagamentoDtoEntrada pgtoDtoEntrada, @PathVariable Long codPagamento) {
		return pgtoService.alterar(pgtoDtoEntrada, codPagamento);
	}

	@DeleteMapping("/{codPagamento}")
	public void excliur(@PathVariable Long codPagamento) {
		pgtoService.excluir(codPagamento);
	}

}
