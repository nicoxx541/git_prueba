package cl.duoc.zoo.Models;

import cl.duoc.zoo.Utils.TipoEstadoCivil;
import cl.duoc.zoo.Utils.Validacion;
import java.time.LocalDate;
import java.time.Month;


public class Visitante {
    private int rut;
    private char dv;
    private String nombreCompleto;
    private String direccion;
    private String correo;
    private long telefono;
    private LocalDate fechaNacimiento;
    private TipoEstadoCivil estadoCivil;

    public Visitante(int rut, char dv, String nombreCompleto, String direccion, String correo, long telefono, LocalDate fechaNacimiento, TipoEstadoCivil estadoCivil) {
        this.rut = rut;
        this.dv = dv;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }

   public Visitante() {
        this.rut = 0;
        this.dv = '0';
        this.nombreCompleto = "";
        this.direccion = "";
        this.correo = "";
        this.telefono = 0;
        this.fechaNacimiento = LocalDate.now();
        this.estadoCivil = estadoCivil.sindato;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut, char dv) {
      if(Validacion.ValidarRut(rut, dv))
      {
        this.rut = rut;
        this.dv = dv;
      }
      else{
          System.out.println("rut invalido");
      }

    }

    public char getDv() {
        return dv;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
       if(Validacion.ValidarTelefono(telefono)){
          this.direccion = direccion;
       }
       else{
           System.out.println("ingrese un numero valido");
       }  
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
       if(Validacion.ValidarCorreo(correo)){
          this.correo = correo; 
       }
       else{
           System.out.println("No ingreso un correo correcto");
       }
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
       if(Validacion.ValidarFecha(fechaNacimiento)){
        this.fechaNacimiento = fechaNacimiento;
        }
        else{
           System.out.println("fecha invalida");
       }
    
    }

    public TipoEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Visitante{" + "rut=" + rut + ", dv=" + dv + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
