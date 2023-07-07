package ar.agenda.agendaVirtual.controller;

import ar.agenda.agendaVirtual.model.Contacto;
import ar.agenda.agendaVirtual.repository.RepositoryContacto;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//Lo que hace el controller es atender la solicitudes HTTP, INTERACTUA CON EL MODELO, RESPONDE A LA PAGINA PRINCIPAL

@Controller
public class ControllerContacto {
    
    @Autowired
    private RepositoryContacto contactoRepository;
    
    @GetMapping
    String index(Model model){
        List<Contacto> contactos = contactoRepository.findAll();
        
        model.addAttribute("contactos", contactos);
        return "index";
    }
    
    @GetMapping("/nuevo")
    String nuevo(Model model){
        model.addAttribute("contacto", new Contacto());
        return "nuevo";
    }
    
    @PostMapping("/nuevo")
    String crear(Contacto contacto, RedirectAttributes ra){ //Vamos a utilizar redirecattribute que lo que hace es poder mostrar mensajes como de error o de exito.
        contacto.setFecharegistro(LocalDateTime.now()); //esto lo que hace es traernos la fecha y hora actual y lo asigna a fecharegistro
        contactoRepository.save(contacto);
        ra.addFlashAttribute("msgExito", "El contacto " + contacto.getNombre() + " se ah creado correctamente");
        return "redirect:/";
    }
    
}
