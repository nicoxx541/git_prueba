package cl.duoc.zoo.Models;

import cl.duoc.zoo.Utils.TipoClima;
import java.time.LocalDate;



public class Leon extends Animal {
    private LocalDate fechaDentista;

    public Leon(LocalDate fechaDentista, int numeroRegistro, String nombre, LocalDate edad, TipoClima tipoclima, String descipcion) {
        super(numeroRegistro, nombre, edad, tipoclima, descipcion);
        this.fechaDentista = fechaDentista;
    }
    
    public Leon() {
        super();
        this.fechaDentista = LocalDate.of(0, 0, 0);
    }

    public Leon(LocalDate fechaDentista) {
        this.fechaDentista = fechaDentista;
    }

    public LocalDate getFechaDentista() {
        return fechaDentista;
    }

    public void setFechaDentista(LocalDate fechaDentista) {
        this.fechaDentista = fechaDentista;
    }

    @Override
    public String toString() {
        return "Leon{" + "numeroRegistro=" + super.getNumeroRegistro() + ", nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", tipoclima=" + super.getTipoclima() + ", descipcion=" + super.getDescipcion() + "fechaDentista=" + fechaDentista + '}';
    }
    
    
    
    
}
