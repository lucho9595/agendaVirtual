package ar.agenda.agendaVirtual.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se utiliza el generation type identity por que estamos utilizando MySQL
    private Integer idcontacto;

    @NotBlank
    private String nombre;

    @PastOrPresent
    private LocalDate fechanac;

    @NotBlank
    @Size(max = 15)
    private String celular;

    @Email
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
