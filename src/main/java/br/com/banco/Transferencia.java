package br.com.banco;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Transferencia {
  @Id
  private Integer id;
  private String data_transferencia;
  private Double valor;
  private String tipo;
  private String nome_operador_transacao;
  private Integer conta_id;

  @OneToMany(mappedBy = "transferencia")
    private List<Conta> conta;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDataTransferencia() {
    return data_transferencia;
  }

  public void setDataTransferencia(String data_transferencia) {
    this.data_transferencia = data_transferencia;
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
    return nome_operador_transacao;
  }

  public void setNomeOperadorTransacao(String nome_operador_transacao) {
    this.nome_operador_transacao = nome_operador_transacao;
  }

  public Integer getContaId() {
    return conta_id;
  }

  public void setContaId(Integer conta_id) {
    this.conta_id = conta_id;
  }

  
}