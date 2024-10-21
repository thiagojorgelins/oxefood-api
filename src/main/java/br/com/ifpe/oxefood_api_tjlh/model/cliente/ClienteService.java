package br.com.ifpe.oxefood_api_tjlh.model.cliente;

import java.time.LocalDate;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository repository;

  @Transactional
  public Cliente save(Cliente cliente) {

    cliente.setHabilitado(Boolean.TRUE);
    cliente.setVersao(1L);
    cliente.setDataCriacao(LocalDate.now());
    return repository.save(cliente);
  }

}
