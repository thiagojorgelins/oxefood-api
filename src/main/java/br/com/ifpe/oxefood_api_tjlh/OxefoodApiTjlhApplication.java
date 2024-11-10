package br.com.ifpe.oxefood_api_tjlh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxefoodApiTjlhApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiTjlhApplication.class, args);
	}

}
