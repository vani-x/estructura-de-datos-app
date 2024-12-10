package com.proyectoInf121.estructurasDeDatos;
public class Zona {

    private String tipo,nombre,idArea;

    public Zona(String tipo, String nombre, String idArea) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.idArea = idArea;
    }
    public Zona(){} 
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdArea() {
        return idArea;
    }
    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }
    public void mostrar(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Nombre: "+nombre);
        System.out.println("IdArea: "+idArea);
    }
}