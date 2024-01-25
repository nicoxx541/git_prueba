package cl.duoc.zoo.Models;

import cl.duoc.zoo.Utils.TipoClima;
import java.time.LocalDate;


public class Tigre extends Animal {
    private String origen;
    private int codigoGatuno;

    public Tigre(String origen, int codigoGatuno, int numeroRegistro, String nombre, LocalDate edad, TipoClima tipoclima, String descipcion) {
        super(numeroRegistro, nombre, edad, tipoclima, descipcion);
        this.origen = origen;
        this.codigoGatuno = codigoGatuno;
    }
    
    public Tigre() {
        super();
        this.origen = "";
        this.codigoGatuno = 0;
    }

    public Tigre(String origen, int codigoGatuno) {
        this.origen = origen;
        this.codigoGatuno = codigoGatuno;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigoGatuno() {
        return codigoGatuno;
    }

    public void setCodigoGatuno(int codigoGatuno) {
        this.codigoGatuno = codigoGatuno;
    }

    @Override
    public String toString() {
        return "Tigre{" + "numeroRegistro=" + super.getNumeroRegistro() + ", nombre=" + super.getNombre() + ", edad=" + super.getEdad()+ ", tipoclima=" + super.getTipoclima() + ", descipcion=" + super.getDescipcion() + "origen=" + origen + ", codigoGatuno=" + codigoGatuno + '}';
    }
    
    
    
    
}
