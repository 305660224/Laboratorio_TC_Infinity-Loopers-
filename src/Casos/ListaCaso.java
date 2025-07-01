/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

/**
 *
 * @author Luisk
 */
public class ListaCaso {
     private static final int CasosMaximos = 100;
    private Caso[] casos;
    private int cantidad;
    
    public boolean agregarCaso(Caso nuevo) {
        if (cantidad < CasosMaximos) {
            casos[cantidad] = nuevo;
            cantidad++;
            return true;
        }
        return false; 
    }

    public boolean eliminarCaso(String id) {
        for (int i = 0; i < cantidad; i++) {
            if (casos[i].getId().equalsIgnoreCase(id)) {
                casos[i] = casos[cantidad - 1];
                casos[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    public void mostrarCasos() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(casos[i]);
        }
    }
    
   public int contarPorPrioridad(EnumPrioridadd prioridadBuscada) {
    int conteo = 0;
    for (int i = 0; i < cantidad; i++) {
        if (casos[i] != null && casos[i].getPrioridad() == prioridadBuscada) {
            conteo++;
        }
    }
    return conteo;
   }
    
    public int getCantidad() {
        return cantidad;
    }

    public ListaCaso() {
        casos = new Caso[CasosMaximos];
        cantidad = 0;
    }
   
}
