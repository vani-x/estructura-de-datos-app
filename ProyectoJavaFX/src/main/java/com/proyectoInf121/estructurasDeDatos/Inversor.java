package com.proyectoInf121.estructurasDeDatos;

public class Inversor extends Persona{
    private String ci;
    private double monto;
    private int numeroCelular;

    public Inversor(String nombre, String interes, String idArea, int edad, String ci, double monto, int numeroCelular) {
        super(nombre, interes, idArea, edad);
        this.ci = ci;
        this.monto = monto;
        this.numeroCelular = numeroCelular;
    }
    public Inversor(){}
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public int getNumeroCelular() {
        return numeroCelular;
    }
    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("CI: "+ci);
        System.out.println("Monto: "+monto);
        System.out.println("Numero Celular: "+numeroCelular);
    }
    
}