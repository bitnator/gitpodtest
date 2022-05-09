package br.com.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transferencia")
public class Transferencia {
  @Id
  private Integer id;
  @Column(name = "data_transferencia")
  private String dataTransferencia;
  private Double valor;
  private String tipo;
  @Column(name = "nome_operador_transacao")
  private String nomeOperadorTransacao;

  @ManyToOne
  @JoinColumn(name = "conta_id")
  private Conta conta;

  public Transferencia(Integer id, String dataTransferencia, Double valor, String tipo, String nomeOperadorTransacao,
      Conta conta) {
    this.id = id;
    this.dataTransferencia = dataTransferencia;
    this.valor = valor;
    this.tipo = tipo;
    this.nomeOperadorTransacao = nomeOperadorTransacao;
    this.conta = conta;
  }

  public Transferencia() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDataTransferencia() {
    return dataTransferencia;
  }

  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getNomeOperadorTransacao() {
    return nomeOperadorTransacao;
  }

  public void setNomeOperadorTransacao(String nomeOperadorTransacao) {
    this.nomeOperadorTransacao = nomeOperadorTransacao;
  }

  public Conta getConta() {
    return conta;
  }

  public void setConta(Conta conta) {
    this.conta = conta;
  }

  
}