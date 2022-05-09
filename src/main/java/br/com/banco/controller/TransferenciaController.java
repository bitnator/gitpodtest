package br.com.banco.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.model.Transferencia;
import br.com.banco.repository.TransferenciaRepository;

// @CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
// @RequestMapping("/transferencias")
public class TransferenciaController {
  @Autowired 
  private TransferenciaRepository transRepository;
  
  @GetMapping()
  public @ResponseBody Collection<Transferencia> getTransferencias(@RequestParam(required = false) String nome, @RequestParam(required = false) String data_inicio, @RequestParam(required = false) String data_fim) {
    Collection<Transferencia> transferencias = null;

    if((nome != null) && (data_inicio != null) && (data_fim != null)) {
      transferencias = transRepository.transferenciasPorNomeData(nome, data_inicio, data_fim);
    } else if((nome == null) && (data_inicio != null) && (data_fim != null)) {
      transferencias = transRepository.transferenciasPorData(data_inicio, data_fim);
    } else if((nome != null) && ((data_inicio == null) || (data_fim == null))) {
      transferencias = transRepository.transferenciasPorNome(nome);
    } else {
      transferencias = transRepository.transferencias();
    }
    return transferencias;
    
  }
  
}