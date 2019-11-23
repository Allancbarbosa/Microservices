package com.example.pessoas.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<PessoaDtoSaida> listar() {

		List<PessoaDtoSaida> lista = null;

		List<Pessoa> listaPessoa = pessoaRepository.findAll();
		for (Pessoa pessoa : listaPessoa) {
			if (lista == null) {
				lista = new ArrayList<PessoaDtoSaida>();
			}

			PessoaDtoSaida pessoaDtoSaida = new PessoaDtoSaida(pessoa);
			lista.add(pessoaDtoSaida);
		}

		return lista;

	}
	
	public PessoaDtoSaida buscar(Long id) {
		PessoaDtoSaida pessoaDtoSaida = null;
		Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);
		if(pessoaOptional.isPresent()) {
			Pessoa pessoa = pessoaOptional.get();
			pessoaDtoSaida = new PessoaDtoSaida(pessoa);
		}
		return pessoaDtoSaida;
	}
	
	public PessoaDtoSaida adicionar(PessoaDtoEntrada pessoaDtoEntrda) {
		PessoaDtoSaida pessoaDtoSaida = null;
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(pessoaDtoEntrda.getNome());
		pessoa.setEndereco(pessoaDtoEntrda.getEndereco());
		pessoa.setProfissao(pessoaDtoEntrda.getProfissao());
		pessoa.setDtnascimento(pessoaDtoEntrda.getDtnascimento());
		
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		if(pessoaSalva != null) {
			pessoaDtoSaida = new PessoaDtoSaida(pessoaSalva);
		}
		
		return pessoaDtoSaida;
	}
	
	public PessoaDtoSaida alterar(PessoaDtoEntrada pessoaDtoEntrda, Long id) {
		PessoaDtoSaida pessoaDtoSaida = null;
		
		Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);
		if(pessoaOptional.isPresent()) {
			Pessoa pessoa = pessoaOptional.get();
			pessoa.setNome(pessoaDtoEntrda.getNome());
			pessoa.setEndereco(pessoaDtoEntrda.getEndereco());
			pessoa.setProfissao(pessoaDtoEntrda.getProfissao());
			pessoa.setDtnascimento(pessoaDtoEntrda.getDtnascimento());
			Pessoa pessoaSalva = pessoaRepository.save(pessoa);
			if(pessoaSalva != null) {
				pessoaDtoSaida = new PessoaDtoSaida(pessoaSalva);
			}
		}
		
		return pessoaDtoSaida;
	}
	
	public void excluir(Long id) {
		pessoaRepository.deleteById(id);
	}
	

}
