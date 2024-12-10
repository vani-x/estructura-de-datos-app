public class CCircularE {

    private int max=50,ini,fin;
    private Empresa[] v= new Empresa[max+1];

    public CCircularE(){
        ini=0;
        fin=0;
    }
    public boolean esVacia(){
        return ini==fin;
    }
    public boolean esLlena(){
        return (fin+1)%max==ini;
    }
    public void adicionar(Empresa x){
        if(!esLlena()){
            v[fin]=x;
            fin=(fin+1)%max;
        }
    }
    public Empresa eliminar(){
        Empresa x=null;
        if(!esVacia()){
            x=v[ini];
            ini=(ini+1)%max;
        }
        return x;
    }
    public void mostrar(){
        int i=ini;
        while(i!=fin){
            v[i].mostrar();
            i=(i+1)%max;
        }
    }
    
}