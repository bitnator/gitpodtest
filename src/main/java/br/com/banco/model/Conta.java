package br.com.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="conta")

public class Conta {

  @Id
  @Column(name = "id_conta")
  private Integer id;
  @Column(name = "nome_responsavel")
  private String nomeResponsavel;

  public Conta(Integer id, String nomeResponsavel) {
    this.id = id;
    this.nomeResponsavel = nomeResponsavel;
  }

  public Conta() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNomeResponsavel() {
    return nomeResponsavel;
  }

  public void setNomeResponsavel(String nomeResponsavel) {
    this.nomeResponsavel = nomeResponsavel;
  }

  

}