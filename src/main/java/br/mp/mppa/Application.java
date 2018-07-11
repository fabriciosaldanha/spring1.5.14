package br.mp.mppa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ImportResource("classpath:config-bd.xml")
@EnableJpaRepositories("br.mp.mppa.repository" )
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
