/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Caso {
    private String Id;
    private String Victima;
    private String Descripcion;
    private String Tipo;
    private LocalDate FechaRegistro;
    private String Prioridad;
    
    public String getId() {
        return Id;
    }

    public String getVictima() {
        return Victima;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public LocalDate getFechaRegistro() {
        return FechaRegistro;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }
    
    public Caso(String Id, String Victima, String Descripcion, String Tipo, LocalDate FechaRegistro, String Prioridad) {
        this.Id = Id;
        this.Victima = Victima;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
        this.FechaRegistro = FechaRegistro;
        this.Prioridad = Prioridad;
    }
     
     @Override
    public String toString() {
        return "Caso{" +"id='" + Id + '\'' +", victima='" + Victima + '\'' +", descripcion='" + Descripcion + '\'' + ", tipo='" + Tipo + '\'' + ", fechaRegistro=" + FechaRegistro +", prioridad='" + Prioridad + '\'' +'}';
    }
}
