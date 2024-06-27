package br.com.zorp.api.model;

import br.com.zorp.api.genero.Genero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pessoa {
  private String nome;
  private int idade;
  private Genero genero;


  public String exibirDetalhes() {
    String ret = "";

    ret += "-------------------------------";
    ret += "\nNome: " + getNome();
    ret += "\nIdade: " + getIdade();
    ret += "\nGenero: " + getGenero();

    if (getIdade() >= 18) {
      ret += "\nÉ maior de idade!";
    } else {
      ret += "\nÉ menor de idade!";
    }

    ret += "\n-------------------------------";

    return ret;
  }
}
