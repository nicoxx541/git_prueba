package cl.duoc.zoo.Models;

import cl.duoc.zoo.Utils.TipoClima;
import java.time.LocalDate;


public class Elefante extends Animal {
    private int peso;

    public Elefante(int peso, int numeroRegistro, String nombre, LocalDate edad, TipoClima tipoclima, String descipcion) {
        super(numeroRegistro, nombre, edad, tipoclima, descipcion);
        this.peso = peso;
    }
    
    public Elefante() {
        super();
        this.peso = 0;
    }

    public Elefante(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Elefante{" + "numeroRegistro=" + super.getNumeroRegistro() + ", nombre=" + super.getNombre() + ", edad=" + super.getEdad() + ", tipoclima=" + super.getTipoclima() + ", descipcion=" + super.getDescipcion() + "peso=" + peso + '}';
    }
    
    
}
