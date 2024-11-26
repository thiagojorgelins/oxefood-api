package br.com.ifpe.oxefood_api_tjlh.api.entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood_api_tjlh.model.endereco.Endereco;
import br.com.ifpe.oxefood_api_tjlh.model.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {
  private String nome;

  private String cpf;

  private String rg;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;

  private String foneCelular;

  private String foneFixo;

  private Integer qtdEntregasRealizadas;

  private Double valorFrete;

  private Boolean ativo;

  private Endereco endereco;

  public Entregador build() {

    return Entregador.builder()
        .nome(nome)
        .cpf(cpf)
        .rg(rg)
        .dataNascimento(dataNascimento)
        .foneCelular(foneCelular)
        .foneFixo(foneFixo)
        .qtdEntregasRealizadas(qtdEntregasRealizadas)
        .valorFrete(valorFrete)
        .ativo(ativo)
        .endereco(endereco)
        .build();
  }
}
