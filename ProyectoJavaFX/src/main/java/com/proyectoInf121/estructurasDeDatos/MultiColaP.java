public class MultiColaP {

    private int n;
    private CSimpleP[] v;

    public MultiColaP(){
        n=0;
        v=new CSimpleP[50];
        for (int i=0;i<50;i++){
            v[i]=new CSimpleP();
        }
    }
    public boolean esVacia(int i){
        return v[i].esVacia();
    }
    public boolean esLlena(int i){
        return v[i].esLlena();
    }
    public void adicionar(int i,Persona x){
        v[i].adicionar(x);
    }
    public Persona eliminar(int i){
        return v[i].eliminar();
    }
    public void mostrar(int i){
        v[i].mostrar();
    }
    public void mostrar(){
        for(int i=1;i<n;i++){
            System.out.println("Cola "+i);
            mostrar(i);
        }
    }
    public void vaciar(int i,CSimpleP p){
        v[i].vaciar(p);
    }
    public void vaciar(int i,int j){
        while(!v[j].esVacia()){
            adicionar(i,v[j].eliminar());
        }
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public CSimpleP[] getV() {
        return v;
    }
    public void setV(CSimpleP[] v) {
        this.v = v;
    }
    
}