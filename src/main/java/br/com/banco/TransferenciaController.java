package br.com.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 

public class TransferenciaController {
  @Autowired 
  private TransferenciaRepository transRepository;

  @GetMapping(path="/")
  public @ResponseBody Iterable<Transferencia> getTransferencias() {
    Iterable<Transferencia> resultado = null;
    
    resultado = transRepository.transferencias();

    return resultado;
  }

  @GetMapping("/transferencias/{id}")
  public @ResponseBody Iterable<Transferencia> getUserByName(@PathVariable(value="id") String id) {
    Iterable<Transferencia> resultado = null;
    
    resultado = transRepository.transferencias();

    return resultado;
  }

  
}