package cl.duoc.zoo.Models;

import cl.duoc.zoo.Utils.TipoClima;
import cl.duoc.zoo.Utils.Validacion;
import java.time.LocalDate;


public class Animal {
    private int numeroRegistro;
    private String nombre;
    private LocalDate edad;
    private TipoClima tipoclima;
    private String descipcion;

    public Animal(int numeroRegistro, String nombre, LocalDate edad, TipoClima tipoclima, String descipcion) {
        this.numeroRegistro = numeroRegistro;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoclima = tipoclima;
        this.descipcion = descipcion;
    }
    
    public Animal() {
        this.numeroRegistro = 0;
        this.nombre = "";
        this.edad = LocalDate.now();
        this.tipoclima = TipoClima.sinhabitad;
        this.descipcion = "";
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
      if(Validacion.ValidarFecha(edad))
        this.edad = edad;
      else
            System.out.println("ingrese una fecha valida");
    }

    public TipoClima getTipoclima() {
        return tipoclima;
    }

    public void setTipoclima(TipoClima tipoclima) {
        this.tipoclima = tipoclima;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroRegistro=" + numeroRegistro + ", nombre=" + nombre + ", edad=" + edad + ", tipoclima=" + tipoclima + ", descipcion=" + descipcion + '}';
    }
    
    
    
}
