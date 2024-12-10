public class Pedido {

    // en vez de nombre cliente se usa idPedido
    private String idPedido;
    private LDobleP productos;

    public Pedido(String idPedido, LDobleP productos) {
        this.idPedido = idPedido;
        this.productos = productos;
    }
    public Pedido(){}
    public String getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    public LDobleP getProductos() {
        return productos;
    }
    public void setProductos(LDobleP productos) {
        this.productos = productos;
    }
    
    public void mostrar(){
        System.out.println("Id Pedido: "+idPedido);
        System.out.println("Productos: ");
        productos.mostrar();
    }
}