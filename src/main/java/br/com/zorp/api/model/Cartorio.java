package br.com.zorp.api.model;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cartorio {
  private List<Pessoa> pessoas;

  public Cartorio() {
    pessoas = new ArrayList<>();
  }

  public void adicionarPessoa(Pessoa pessoa) {
    pessoas.add(pessoa);
  }

}
