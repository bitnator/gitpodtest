package br.com.banco.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import br.com.banco.model.Transferencia;
import br.com.banco.repository.TransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {
    private TransferenciaRepository transRepository;
 
 @Override
 public Collection<Transferencia> getByName(String nome) {
    Collection resultados = transRepository.transferenciasPorNome(nome);

    return resultados;
 }
}