package ar.agenda.agendaVirtual.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; // Importa la anotación @Id de javax.persistence
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

@Entity
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se utiliza el generation type identity porque estás utilizando MySQL
    private Integer idcontacto;

    @NotBlank(message = "Este campo no debe estar vacío.")
    private String nombre;
    
    @PastOrPresent(message = "La fecha no debe ser futura.")
    private LocalDate fechanac;

    @NotBlank
    @Size(max = 15, message = "Debe tener 15 caracteres como máximo.")
    private String celular;

    @Email(message = "El formato de email es inválido.")
    private String email;

    private LocalDateTime fecharegistro;

    public Contacto() {
    }

    public Integer getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(Integer idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDateTime fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

}
