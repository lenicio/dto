package br.com.zorp.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pessoa {
  private String nome;
  private int idade;


  public String exibirDetalhes() {
    String ret = "";

    ret += "-------------------------------";
    ret += "\nNome: " + getNome();
    ret += "\nIdade: " + getIdade();

    if (getIdade() >= 18) {
      ret += "\nÉ maior de idade!";
    } else {
      ret += "\nÉ menor de idade!";
    }

    ret += "\n-------------------------------";

    return ret;
  }
}
