package com.proyectoInf121.estructurasDeDatos;


public class LDobleP {

    private NodoP p;
    public LDobleP(){
        p=null;
    }
    public NodoP getP() {
        return p;
    }
    public void setP(NodoP p) {
        this.p = p;
    }
    public void adicionar(Producto x){
        NodoP q=new NodoP();
        q.setProducto(x);
        if(p==null){
            p=q;
        }else{
            NodoP t=p;
            while(t.getSig()!=null){
                t=t.getSig();
            }
            t.setSig(q);
            q.setAnt(t);
        }
    }
    public void mostrar(){
        NodoP t=getP();
        while(t!=null){
            t.getProducto().mostrar();
            t=t.getSig();
        }
    }
}