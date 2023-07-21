package ar.agenda.agendaVirtual.repository;

import ar.agenda.agendaVirtual.model.Contacto;
import java.awt.print.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//lo que hace nos ayuda a realizar las operaciones en la base de datos
//es una interface por que se va a autoimplementar cuando se realiza el proceso de compilacion

@Repository
public interface RepositoryContacto extends JpaRepository<Contacto, Integer>{

    public Page<Contacto> findAll(Pageable pageable);
    
}