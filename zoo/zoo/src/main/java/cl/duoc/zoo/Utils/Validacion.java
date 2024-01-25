package cl.duoc.zoo.Utils;

import java.time.LocalDate;


public class Validacion {
    public static boolean ValidarCorreo (String correo){
        return (correo.contains("@") && correo.contains("."));
    }
    
    public static boolean ValidarTelefono(long telefono){
        return ((telefono+"").length()==9);
    }
    
    public static boolean ValidarFecha(LocalDate fecha){
        return fecha.isBefore(LocalDate.now());
    }
    
    public static boolean ValidarRut(int rut, char dv){
        boolean validacion = false;
        try{
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
            s = (s + rut % 10 *(9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)){
            }
        }catch (java.lang.NumberFormatException e){
        }catch (Exception e){
        }
    
        return validacion;
    }
}