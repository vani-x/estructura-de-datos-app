package com.proyectoInf121.estructurasDeDatos;

public class CSimpleP {

    private int max=50,ini,fin;
    private Persona[] v= new Persona[max];

    
    public Persona[] getV() {
        return v;
    }
    public void setV(Persona[] v) {
        this.v = v;
    }
    public CSimpleP(){
        ini=0;
        fin=0;
    }
    public boolean esVacia(){
        return ini==fin;
    }
    public boolean esLlena(){
        return fin==max;
    }
    public void adicionar(Persona x){
        if(!esLlena()){
            if (x instanceof Persona) {
                v[fin]=(Persona)x;
                fin++;
            }else{
                System.out.println("No es un visitante");
            }
        }
    }
    public Persona eliminar(){
        Persona x=null;
        if(!esVacia()){
            x=v[ini];
            ini++;
        }
        return x;
    }
    public void mostrar(){
        for(int i=ini;i<fin;i++){
            v[i].mostrar();
        }
 
   }
   public void vaciar(CSimpleP p){
        while (!p.esVacia()){
            
            adicionar(p.eliminar());
            
        
        }
    }
}