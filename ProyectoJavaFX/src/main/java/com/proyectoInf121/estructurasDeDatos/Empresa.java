package com.proyectoInf121.estructurasDeDatos;

public class Empresa {

    private String nombreEmpresa;
    private Emprendedor emprendedor;
    private LDobleP productoEmpresa;
    private PilaP pedidosVendidos;

    public Empresa(String nombreEmpresa, Emprendedor emprendedor, LDobleP productoEmpresa, PilaP pedidosVendidos) {
        this.nombreEmpresa = nombreEmpresa;
        this.emprendedor = emprendedor;
        this.productoEmpresa = productoEmpresa;
        this.pedidosVendidos = pedidosVendidos;
    }
    public Empresa(){}
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public Emprendedor getEmprendedor() {
        return emprendedor;
    }
    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }
    public LDobleP getProductoEmpresa() {
        return productoEmpresa;
    }
    public void setProductoEmpresa(LDobleP productoEmpresa) {
        this.productoEmpresa = productoEmpresa;
    }
    public PilaP getPedidosVendidos() {
        return pedidosVendidos;
    }
    public void setPedidosVendidos(PilaP pedidosVendidos) {
        this.pedidosVendidos = pedidosVendidos;
    } 
    
    public void mostrar(){
        System.out.println("Nombre Empresa: "+nombreEmpresa);
        emprendedor.mostrar();
        productoEmpresa.mostrar();
        pedidosVendidos.mostrar();
    }
    
}