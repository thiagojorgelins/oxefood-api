package br.com.ifpe.oxefood_api_tjlh.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

  private String enderecoNumero;

  private String enderecoRua;

  private String enderecoBairro;

  private String enderecoCidade;

  private String enderecoCep;

  private String enderecoUF;

  private String enderecoCompleto;
}
