package br.com.ifpe.oxefood_api_tjlh.model.entregador;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EntregadorService {

  @Autowired
  private EntregadorRepository repository;

  @Transactional
  public Entregador save(Entregador entregador) {

    entregador.setHabilitado(Boolean.TRUE);
    entregador.setVersao(1L);
    entregador.setDataCriacao(LocalDate.now());
    return repository.save(entregador);
  }

  public List<Entregador> listarTodos() {
    return repository.findAll();
  }

  public Entregador obterPorID(Long id) {
    return repository.findById(id).get();
  }

  @Transactional
  public void update(Long id, Entregador entregadorAlterado) {

    Entregador entregador = repository.findById(id).get();
    entregador.setNome(entregadorAlterado.getNome());
    entregador.setDataNascimento(entregadorAlterado.getDataNascimento());
    entregador.setCpf(entregadorAlterado.getCpf());
    entregador.setFoneCelular(entregadorAlterado.getFoneCelular());
    entregador.setFoneFixo(entregadorAlterado.getFoneFixo());
    entregador.setEndereco(entregadorAlterado.getEndereco());
    entregador.setAtivo(entregadorAlterado.getAtivo());
    repository.save(entregador);
  }

  @Transactional
  public void delete(Long id) {

    Entregador entregador = repository.findById(id).get();
    entregador.setHabilitado(Boolean.FALSE);
    entregador.setVersao(entregador.getVersao() + 1);

    repository.save(entregador);
  }
}
