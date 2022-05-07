package br.com.banco;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Conta {
  @Id
  private Integer id_conta;

  private String nome_responsavel;

  public Integer getId() {
    return id_conta;
  }

  public void setId(Integer id) {
    this.id_conta = id_conta;
  }

  public String getNome() {
    return nome_responsavel;
  }

  public void setName(String nome_responsavel) {
    this.nome_responsavel = nome_responsavel;
  }


}