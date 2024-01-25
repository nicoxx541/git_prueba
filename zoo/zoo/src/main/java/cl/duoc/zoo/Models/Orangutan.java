package cl.duoc.zoo.Models;

import cl.duoc.zoo.Utils.TipoClima;
import cl.duoc.zoo.Utils.Validacion;
import java.time.LocalDate;


public class Orangutan extends Animal{
    private LocalDate fechaIngreso;

    public Orangutan(LocalDate fechaIngreso, int numeroRegistro, String nombre, LocalDate edad, TipoClima tipoclima, String descipcion) {
        super(numeroRegistro, nombre, edad, tipoclima, descipcion);
        this.fechaIngreso = fechaIngreso;
    }
    
    public Orangutan() {
        super();
        this.fechaIngreso = LocalDate.now();
    }

    public Orangutan(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
       if(Validacion.ValidarFecha(fechaIngreso))
        this.fechaIngreso = fechaIngreso;
       else{
           System.out.println("fecha ingresada no valida");
       }
    }

    @Override
    public String toString() {
        return "Orangutan{" + "numeroRegistro=" + super.getNumeroRegistro() + ", nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", tipoclima=" + super.getTipoclima() + ", descipcion=" + super.getDescipcion()+ "fechaIngreso=" + fechaIngreso + '}';
    }
    
    
    
}
