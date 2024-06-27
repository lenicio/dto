package br.com.zorp.api.controller;

import br.com.zorp.api.dto.PessoaDto;
import br.com.zorp.api.genero.Genero;
import br.com.zorp.api.model.Cartorio;
import br.com.zorp.api.model.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
  Cartorio cartorio = new Cartorio();

  @PostMapping
  public String adicionar(@RequestBody PessoaDto dado) {

    cartorio.adicionarPessoa(
        new Pessoa(
            dado.nome(),
            dado.idade(),
            dado.genero()
        )
    );

    return "Pessoa adicionada com sucesso!";
  }


}
