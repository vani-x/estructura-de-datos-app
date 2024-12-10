public class NodoP {

    private Producto producto;
    private NodoP sig,ant;

    public NodoP(){
        sig=null;
        ant=null;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }

}