/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Casos;

/**
 *
 * @author Luisk
 */
public enum EnumPrioridadd {
    ALTA("Alta"),
    MEDIA("Media"),
    BAJA("Baja");
    private final String texto;

    private EnumPrioridadd(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
