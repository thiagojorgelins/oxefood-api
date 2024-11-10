package br.com.ifpe.oxefood_api_tjlh.util.entity;

import java.time.LocalDate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class EntidadeAuditavel extends EntidadeNegocio {
  
   @JsonIgnore
   @Version
   private Long versao;

   @JsonIgnore
   @CreatedDate
   @Column(nullable = false, updatable = false)
   private LocalDate dataCriacao;

   @JsonIgnore
   @LastModifiedDate
   @Column(insertable = false)
   private LocalDate dataUltimaModificacao;

   @JsonIgnore
   @Column
   private Long criadoPor;

   @JsonIgnore
   @Column
   private Long ultimaModificacaoPor;

}

