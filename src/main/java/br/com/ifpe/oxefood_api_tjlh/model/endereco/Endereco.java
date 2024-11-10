package br.com.ifpe.oxefood_api_tjlh.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

  private String numero;

  private String rua;

  private String bairro;

  private String cidade;

  private String cep;

  private String uf;

  private String complemento;
}
