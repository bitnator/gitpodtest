package br.com.banco;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// import br.com.banco.Conta;

public interface TransferenciaRepository extends JpaRepository<Conta, Integer> {

    @Query("SELECT t FROM Transferencia t ")
    Collection<Transferencia> transferencias();

    @Query("SELECT u FROM Conta u WHERE u.nome_responsavel = ?1")
    Collection<Conta> transPorNome(String name);
    
}

