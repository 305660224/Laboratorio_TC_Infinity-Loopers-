/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package victims;
import java.time.Period;
import java.time.LocalDate;
/**
 *
 * @author UTN
 */
public class victima {
     private LocalDate fechadenacimiento;
     private String genero;
     private String correo;
     private String telefono;
     private String direccion;
     private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
        

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public class CalculadoraEdad {
       public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
        }
    }
 
    public victima(LocalDate fechadenacimiento, String genero, String correo, String telefono, String direccion, String cedula) {
        this.fechadenacimiento = fechadenacimiento;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cedula =String.valueOf( cedula.hashCode());
    }

    @Override
    public String toString() {
        return "victima{" + "fechadenacimiento=" + fechadenacimiento + ", genero=" + genero + ", cedula=" + cedula + '}';
    }
    
}

    

   
     
     
     
