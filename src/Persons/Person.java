/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author ASUS
 */
public abstract class Person {
private String Name;

    public String getName() {
        return Name;
    }

    public Person(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + '}';
    }

}
