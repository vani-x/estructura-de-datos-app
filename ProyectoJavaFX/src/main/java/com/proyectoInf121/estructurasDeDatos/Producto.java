public class Producto {

    private String nombreProducto,tipoProducto;
    private int precioProducto;

    public Producto(String nombreProducto, String tipoProducto, int precioProducto) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.precioProducto = precioProducto;
    }
    public Producto(){}
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public int getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    public void mostrar(){
        System.out.println("Nombre Producto: "+nombreProducto);
        System.out.println("Tipo Producto: "+tipoProducto);
        System.out.println("Precio Producto: "+precioProducto);
    }
}