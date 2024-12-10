public class Main {

    public static void main(String[] args) {
        Inversor i1 = new Inversor("Juan", "Inversiones", "1", 25, "123456", 1000, 123456);
        Inversor i2 = new Inversor("Pedro", "Comida", "1", 35, "123456", 2000, 123456);

        Visitante v1 = new Visitante("Maria", "Tecnologia", "1", 20, 'F');
        Visitante v2 = new Visitante("Ana", "Tecnologia", "1", 20, 'F');
        Visitante v3 = new Visitante("Carlos", "Tecnologia", "1", 20, 'M');
        Visitante v4 = new Visitante("Jose", "Tecnologia", "1", 20, 'M');
        Visitante v5 = new Visitante("Luis", "Tecnologia", "1", 20, 'M');
        Visitante v6 = new Visitante("Luisa", "Tecnologia", "1", 20, 'F');

        Emprendedor e1 = new Emprendedor("Luis", "Tecnologia", "1", 20, "Empresa1");
        Emprendedor e2 = new Emprendedor("Luisa", "Tecnologia", "1", 20, "Empresa2");
        Emprendedor e3 = new Emprendedor("Luis", "Tecnologia", "1", 20, "Empresa3");



        // LSimpleI lSimpleI1nversores = new LSimpleI();
        // lSimpleI1nversores.adicionar(i1);
        // lSimpleI1nversores.adicionar(i2);

        //lSimpleI1nversores.mostrar();

        

        MultiColaP multiColaVisitantes = new MultiColaP();
        multiColaVisitantes.adicionar(1, v1);
        multiColaVisitantes.adicionar(2, i1);
        multiColaVisitantes.adicionar(1, e3);
        multiColaVisitantes.adicionar(2, v3);
        multiColaVisitantes.setN(3);


        multiColaVisitantes.mostrar();


        LSimpleE listaEmprendedores = new LSimpleE();
        listaEmprendedores.adicionar(e1);
        listaEmprendedores.adicionar(e2);


        Producto producto1 = new Producto("majadito", "almuerzo", 33);
        Producto producto2 = new Producto("arroz", "almuerzo", 30);
        Producto producto3 = new Producto("pasta", "almuerzo", 25);
        Producto producto4 = new Producto("sopa", "almuerzo", 20);

        LDobleP listaProductos = new LDobleP();
        listaProductos.adicionar(producto1);
        listaProductos.adicionar(producto2);

        Pedido pedido1 = new Pedido("123", listaProductos);
        Pedido pedido2 = new Pedido("124", listaProductos);

        PilaP pilaPedidos = new PilaP();
        pilaPedidos.adicionar(pedido1);
        pilaPedidos.adicionar(pedido2);

        //pilaPedidos.mostrar();

        

    }
}