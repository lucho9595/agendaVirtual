package ar.agenda.agendaVirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport // Habilita el soporte para paginación
public class AgendaVirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaVirtualApplication.class, args);
	}

}