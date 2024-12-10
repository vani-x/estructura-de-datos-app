package com.proyectoInf121.estructurasDeDatos;
public class NodoE {

    private Emprendedor emprendedor;
    private NodoE sig;

    public NodoE(){
        sig=null;
    }

    public Emprendedor getEmprendedor() {
        return emprendedor;
    }

    public void setEmprendedor(Emprendedor emprendedor) {
        this.emprendedor = emprendedor;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }
    

}   