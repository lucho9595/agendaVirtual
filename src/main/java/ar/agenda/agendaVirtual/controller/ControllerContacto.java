package ar.agenda.agendaVirtual.controller;

import ar.agenda.agendaVirtual.model.Contacto;
import ar.agenda.agendaVirtual.repository.RepositoryContacto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


//Lo que hace el controller es atender la solicitudes HTTP, INTERACTUA CON EL MODELO, RESPONDE A LA PAGINA PRINCIPAL
@Controller
public class ControllerContacto {

    @Autowired
    private RepositoryContacto contactoRepository;

    @GetMapping
    public String index(@RequestParam(required = false) String busqueda,Model model) {
        List<Contacto> contactos;
        if(busqueda != null && busqueda.trim().length() > 0){
            contactos = contactoRepository.findByNombreContaining(busqueda);
        }else{
            contactos = contactoRepository.findAll();
        }
        model.addAttribute("contactos", contactos);
        return "index";
    }

    @GetMapping("/nuevo")
    String nuevo(Model model) {
        model.addAttribute("contacto", new Contacto()); // Cambio aquí: Crea un nuevo objeto Contacto
        return "nuevo";
    }

    @PostMapping("/nuevo") //El BingindResult es como un contenedor de errores, por eso si o si para validaciones lo precisamos.
    String crear(@Validated Contacto contacto, BindingResult bindingResult, RedirectAttributes ra, Model model) { //Vamos a utilizar redirecattribute que lo que hace es poder mostrar mensajes como de error o de exito.
        if (bindingResult.hasErrors()) {
            model.addAttribute("contactos", contacto);
            return "nuevo";
        }
        contacto.setFecharegistro(LocalDateTime.now()); //esto lo que hace es traernos la fecha y hora actual y lo asigna a fecharegistro
        contactoRepository.save(contacto);
        ra.addFlashAttribute("msgExito", "El contacto " + contacto.getNombre() + " se ah creado correctamente");
        return "redirect:/";
    }

    @GetMapping("/{id}/editar")
    String editar(@PathVariable Integer id, Model model) {
        Contacto contactos = contactoRepository.getById(id);

        // Formateamos la fecha de nacimiento como una cadena en formato "yyyy-MM-dd"
        String fechaNacimientoFormatted = contactos.getFechanac().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        model.addAttribute("contacto", contactos);
        model.addAttribute("fechaNacimientoFormatted", fechaNacimientoFormatted);
        return "nuevo";
    }

    @PostMapping("/{id}/editar") //aca editamos al contacto
    String actualizar(@PathVariable Integer id,
            @Validated Contacto contactos,
            BindingResult bindingResult,
            RedirectAttributes ra,
            Model model
    ) { //Vamos a utilizar redirecattribute que lo que hace es poder mostrar mensajes como de error o de exito.
        if (bindingResult.hasErrors()) {
            model.addAttribute("contactos", contactos);
            return "nuevo";
        }

        Contacto contactoFromDb = contactoRepository.getById(id);
        contactoFromDb.setNombre(contactos.getNombre());
        contactoFromDb.setCelular(contactos.getCelular());
        contactoFromDb.setEmail(contactos.getEmail());
        contactoFromDb.setFechanac(contactos.getFechanac());

        contactoRepository.save(contactoFromDb); //Save hace 2 cosas: crea y actualiza, se basa en el id, si el objeto tiene un id se actualiza, si no se crea el objeto.
        ra.addFlashAttribute("msgExito", "El contacto " + contactos.getNombre() + " se ah actualizado correctamente");
        return "redirect:/";
    }

    ;
    
     @PostMapping("/{id}/eliminar")
    String eliminar(@PathVariable Integer id, RedirectAttributes ra) {
        Contacto contactos = contactoRepository.getById(id);
        contactoRepository.delete(contactos);

        ra.addFlashAttribute("msgExito", "El contacto " + contactos.getNombre() + " se ah eliminado correctamente");

        return "redirect:/";
    }
;
};
