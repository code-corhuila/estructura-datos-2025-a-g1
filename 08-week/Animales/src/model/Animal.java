package model;

import java.awt.*;

public abstract class Animal {
    private String nombre;
    private int edad;
    private float peso;

    public Animal(String nombre, int edad, float peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public abstract void beber();
}
