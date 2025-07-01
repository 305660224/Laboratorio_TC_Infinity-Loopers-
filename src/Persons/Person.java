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
private String Id;

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }
    
    public Person(String Name, String Id) {
        this.Name = Name;
        this.Id = Id;
        
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + '}';
    }

}
