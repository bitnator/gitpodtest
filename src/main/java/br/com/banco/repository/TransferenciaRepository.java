package br.com.banco.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.banco.model.Transferencia;


public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {

    @Query("SELECT t FROM Transferencia t")
    Collection<Transferencia> transferencias();

    @Query("SELECT t FROM Transferencia t WHERE t.nomeOperadorTransacao = ?1 ")
    Collection<Transferencia> transferenciasPorNome(String nome);

    @Query("SELECT t FROM Transferencia t WHERE (t.dataTransferencia BETWEEN ?1 AND ?2 )")
    Collection<Transferencia> transferenciasPorData(String dataInicio, String dataFim);

    @Query("SELECT t FROM Transferencia t WHERE t.nomeOperadorTransacao = ?1 AND t.dataTransferencia BETWEEN ?2 AND ?3 ")
    Collection<Transferencia> transferenciasPorNomeData(String nome, String dataInicio, String dataFim);

}

