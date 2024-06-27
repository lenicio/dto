package br.com.zorp.api.dto;

import br.com.zorp.api.genero.Genero;

public record PessoaDto(String nome, int idade, Genero genero) {}
