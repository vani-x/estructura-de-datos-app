public class PilaP {

    private int max=50,tope;
    private Pedido[] v=new Pedido[max+1];

    public PilaP(){
        tope=0;
    }
    public boolean esVacia(){
        return tope==0;
    }
    public boolean esLlena(){
        return tope==max;
    }
    public void adicionar(Pedido x){
        if(!esLlena()){
            tope++;
            v[tope]=x;
        }
    }
    public Pedido eliminar(){
        Pedido x=null;
        if(!esVacia()){
            x=v[tope];
            tope--;
        }
        return x;
    }
    public void mostrar(){
        for(int i=tope;i>0;i--){
            v[i].mostrar();
        }
    }
    public void vaciar(PilaP p){
        while(!p.esVacia()){
            adicionar(p.eliminar());
        }
    }
}