package br.com.zorp.api.controller;

import br.com.zorp.api.dto.PessoaDto;
import br.com.zorp.api.model.Pessoa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

  @PostMapping
  public String helloPost(@RequestBody PessoaDto dado) {
    return dado.nome();
  }


}
