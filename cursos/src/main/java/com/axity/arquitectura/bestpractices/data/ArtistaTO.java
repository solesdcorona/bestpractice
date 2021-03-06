package com.axity.arquitectura.bestpractices.data;

import java.util.Date;
import java.util.Objects;

public class ArtistaTO {

    private String nombre;

    private String apellidos;

    private Integer edad;

    private Date fechaNacimiento;



    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistaTO artistaTO = (ArtistaTO) o;
        return Objects.equals(nombre, artistaTO.nombre) &&
                Objects.equals(edad, artistaTO.edad);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, edad);
    }
}
