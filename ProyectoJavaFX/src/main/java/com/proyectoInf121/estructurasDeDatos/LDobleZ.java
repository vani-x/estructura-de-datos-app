package com.proyectoInf121.estructurasDeDatos;
public class LDobleZ {

    private NodoZ p;

    public LDobleZ(){
        p=null;
    }
    public NodoZ getP() {
        return p;
    }
    public void setP(NodoZ p) {
        this.p = p;
    }
    public void adicionar(Zona x){
        NodoZ q=new NodoZ();
        q.setZona(x);
        if(p==null){
            p=q;
        }else{
            NodoZ t=p;
            while(t.getSig()!=null){
                t=t.getSig();
            }
            t.setSig(q);
            q.setAnt(t);
        }
    }
    public void mostrar(){
        NodoZ t=getP();
        while(t!=null){
            t.getZona().mostrar();
            t=t.getSig();
        }
    }
    public Zona eliminar(){
        Zona x=null;
        if(p!=null){
            x=p.getZona();
            p=p.getSig();
            if(p!=null){
                p.setAnt(null);
            }
        }
        return x;
    }
}