package com.proyectoInf121.estructurasDeDatos;
public class LSimpleE {

    private NodoE p;

    public LSimpleE(){
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
    public void adicionar(Emprendedor x){
        NodoE q=new NodoE();
        q.setEmprendedor(x);
        if(p==null){
            p=q;
        }else{
            NodoE t=p;
            while(t.getSig()!=null){
                t=t.getSig();
            }
            t.setSig(q);
        }
    }
    public void mostrar(){
        NodoE t=getP();
        while(t!=null){
            t.getEmprendedor().mostrar();
            t=t.getSig();
        }
    }
    
}