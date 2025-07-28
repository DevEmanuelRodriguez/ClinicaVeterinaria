
package com.mycompany.peluqueriacanina2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numCliente;
    
    private String nombre;
    private String raza;
    private String color;
    private String atencionEspecial;
    private String alergico;
    private String observaciones;
    //Relacion 1 a 1 entre mascota y duenio
    @OneToOne
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(int numCliente, String nombre, String raza, String color, String atencionEspecial, String alergico, String observaciones, Duenio duenio) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.atencionEspecial = atencionEspecial;
        this.alergico = alergico;
        this.observaciones = observaciones;
        this.duenio = duenio;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

   

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "numCliente=" + numCliente + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", atencionEspecial=" + atencionEspecial + ", alergico=" + alergico + ", observaciones=" + observaciones + ", duenio=" + duenio + '}';
    }

   

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
