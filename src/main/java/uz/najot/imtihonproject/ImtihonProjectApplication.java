package uz.najot.imtihonproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImtihonProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImtihonProjectApplication.class, args);
	}

}
