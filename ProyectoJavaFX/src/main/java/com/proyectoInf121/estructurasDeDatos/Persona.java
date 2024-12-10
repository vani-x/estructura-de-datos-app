package com.proyectoInf121.estructurasDeDatos;
public class Persona {

    private String nombre,interes,idArea;
    private int edad;

    public Persona(String nombre, String interes, String idArea, int edad) {
        this.nombre = nombre;
        this.interes = interes;
        this.idArea = idArea;
        this.edad = edad;
    }
    public Persona(){}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getInteres() {
        return interes;
    }
    public void setInteres(String interes) {
        this.interes = interes;
    }
    public String getIdArea() {
        return idArea;
    }
    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Interes: "+interes);
        System.out.println("IdArea: "+idArea);
        System.out.println("Edad: "+edad);
    }
}