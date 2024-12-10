package com.proyectoInf121.estructurasDeDatos;

public class Emprendedor extends Persona{
    private String nombreEmpresa;

    public Emprendedor(String nombre, String interes, String idArea, int edad, String nombreEmpresa) {
        super(nombre, interes, idArea, edad);
        this.nombreEmpresa = nombreEmpresa;
    }
    public Emprendedor(){}
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Nombre Empresa: "+nombreEmpresa);
    }

    
}