package com.proyectoInf121.estructurasDeDatos;
public class NodoZ {

    private Zona zona;
    private NodoZ sig,ant;

    public NodoZ(){
        sig=ant=null;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public NodoZ getSig() {
        return sig;
    }

    public void setSig(NodoZ sig) {
        this.sig = sig;
    }
    public NodoZ getAnt() {
        return ant;
    }
    public void setAnt(NodoZ ant) {
        this.ant = ant;
    }
    
}