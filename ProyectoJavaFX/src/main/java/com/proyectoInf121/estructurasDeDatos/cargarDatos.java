package com.proyectoInf121.estructurasDeDatos;
import com.proyectoInf121.estructurasDeDatos.*;

public class cargarDatos {
     // Crear inversores, visitantes, emprendedores, productos, etc.
    public static MultiColaP cargarDatosMultiColaP() {
        MultiColaP multiColaVisitantes=new MultiColaP();
        Inversor i1 = new Inversor("Juan", "Inversiones", "1", 25, "123456", 1000, 123456);
        Inversor i2 = new Inversor("Pedro", "Comida", "1", 35, "123456", 2000, 123456);
   
        Visitante v1 = new Visitante("Maria", "Tecnologia", "1", 20, 'F');
        Visitante v2 = new Visitante("Ana", "Tecnologia", "1", 20, 'F');
        Visitante v3 = new Visitante("Carlos", "Tecnologia", "1", 20, 'M');
   
        Emprendedor e1 = new Emprendedor("Luis", "Tecnologia", "1", 20, "Empresa1");
        Emprendedor e2 = new Emprendedor("Luisa", "Tecnologia", "1", 20, "Empresa2");
   
        multiColaVisitantes = new MultiColaP();
        multiColaVisitantes.adicionar(1, v1);
        multiColaVisitantes.adicionar(0, i1);
        multiColaVisitantes.adicionar(1, e1);
        multiColaVisitantes.adicionar(2, v3);
        multiColaVisitantes.adicionar(2, i2);
        multiColaVisitantes.adicionar(1, v2);
        multiColaVisitantes.adicionar(2, e2);
        multiColaVisitantes.setN(3);
        
        return multiColaVisitantes;
    }
    public static LSimpleE cargarDatosListaEmprendedores() {
        LSimpleE listaEmprendedores = new LSimpleE();
        Emprendedor emprendedor1 = new Emprendedor("Luis", "Tecnologia", "1", 20, "Empresa1");
        Emprendedor emprendedor2 = new Emprendedor("Luisa", "Tecnologia", "1", 20, "Empresa2");
        listaEmprendedores.adicionar(emprendedor1);
        listaEmprendedores.adicionar(emprendedor2);
        return listaEmprendedores;
    }
     public static LDobleP cargarDatosProducto() {
        LDobleP listaProductos = new LDobleP();
        Producto producto1 = new Producto("papel","utiles",20);
        Producto producto2 = new Producto("124", "Producto2", 2000);
        listaProductos.adicionar(producto1);
        listaProductos.adicionar(producto2);
        return listaProductos;
    }
    public static PilaP cargarDatosPilaPedidos() {
        PilaP pilaPedidos = new PilaP();
        Pedido pedido1 = new Pedido("123",cargarDatosProducto());
        Pedido pedido2 = new Pedido("124", cargarDatosProducto());
        pilaPedidos.adicionar(pedido1);
        pilaPedidos.adicionar(pedido2);
        return pilaPedidos;
    }
}
