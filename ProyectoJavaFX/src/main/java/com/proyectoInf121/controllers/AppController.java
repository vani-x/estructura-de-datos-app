package com.proyectoInf121.controllers;



// import com.proyectoInf121.structures.Pila;
// import com.proyectoInf121.structures.Cola;
import com.proyectoInf121.estructurasDeDatos.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.animation.PauseTransition;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class AppController {
   
    @FXML
    private Pane displayPane; // Panel donde se dibujarán las estructuras de datos
    @FXML
    private TextArea displayArea; // Área para texto descriptivo
    
    // @FXML
    // private VBox stackContainer;

    // @FXML
    // private VBox queueContainer;

    // @FXML
    // private TextField inputField;

    // private void mostrarDatosIniciales() {
    //     // Mostrar datos en el área de texto
    //     StringBuilder datos = new StringBuilder();

    //     datos.append("MultiCola de Visitantes:\n");
    //     datos.append(multiColaVisitantes.mostrar()).append("\n\n");

    //     datos.append("Lista de Emprendedores:\n");
    //     datos.append(listaEmprendedores.mostrar()).append("\n\n");

    //     datos.append("Pila de Pedidos:\n");
    //     datos.append(pilaPedidos.mostrar()).append("\n\n");

    //     displayArea.setText(datos.toString());
    // }

    // @FXML
    // private void handleAdicionarVisitante() {
    //     // Lógica para agregar un visitante desde el formulario
    // }

    // @FXML
    // private void handleAdicionarPedido() {
    //     // Lógica para agregar un pedido desde el formulario
    // }

    // @FXML
    // private void handleMostrarDatos() {
    //     mostrarDatosIniciales();
    // }




    private MultiColaP multiColaVisitantes;
    private PilaP pilaPedidos;
    private LSimpleE listaEmprendedores;

    public void initialize() {
        inicializarDatos();
    }

    private void inicializarDatos() {
        // Crear inversores, visitantes, emprendedores, productos, etc.
        Inversor i1 = new Inversor("Juan", "Inversiones", "1", 25, "123456", 1000, 123456);
        Inversor i2 = new Inversor("Pedro", "Comida", "1", 35, "123456", 2000, 123456);

        Visitante v1 = new Visitante("Maria", "Tecnologia", "1", 20, 'F');
        Visitante v2 = new Visitante("Ana", "Tecnologia", "1", 20, 'F');
        Visitante v3 = new Visitante("Carlos", "Tecnologia", "1", 20, 'M');

        Emprendedor e1 = new Emprendedor("Luis", "Tecnologia", "1", 20, "Empresa1");
        Emprendedor e2 = new Emprendedor("Luisa", "Tecnologia", "1", 20, "Empresa2");

        multiColaVisitantes = new MultiColaP();
        multiColaVisitantes.adicionar(1, v1);
        multiColaVisitantes.adicionar(2, i1);
        multiColaVisitantes.adicionar(1, e1);
        multiColaVisitantes.adicionar(2, v3);
        multiColaVisitantes.setN(3);

        listaEmprendedores = new LSimpleE();
        listaEmprendedores.adicionar(e1);
        listaEmprendedores.adicionar(e2);

        Producto producto1 = new Producto("majadito", "almuerzo", 33);
        Producto producto2 = new Producto("arroz", "almuerzo", 30);

        LDobleP listaProductos = new LDobleP();
        listaProductos.adicionar(producto1);
        listaProductos.adicionar(producto2);

        Pedido pedido1 = new Pedido("123", listaProductos);
        Pedido pedido2 = new Pedido("124", listaProductos);

        pilaPedidos = new PilaP();
        pilaPedidos.adicionar(pedido1);
        pilaPedidos.adicionar(pedido2);
    }

    @FXML
    private void handleVisualizarDatos() {
        displayPane.getChildren().clear(); // Limpiar el panel de visualización
        animarMultiCola();
        animarPila();
        animarListaEmprendedores();
    }

    private void animarMultiCola() {
        // Animación para MultiCola
        PauseTransition pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(event -> {
            displayArea.appendText("Visualizando MultiCola de Visitantes...\n");
            // Agregar elementos visuales al displayPane para representar MultiCola
        });
        pause.play();
    }

    private void animarPila() {
        // Animación para la Pila
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> {
            displayArea.appendText("Visualizando Pila de Pedidos...\n");
            // Agregar elementos visuales al displayPane para representar Pila
        });
        pause.play();
    }

    private void animarListaEmprendedores() {
        // Animación para la Lista
        PauseTransition pause = new PauseTransition(Duration.seconds(3));
        pause.setOnFinished(event -> {
            displayArea.appendText("Visualizando Lista de Emprendedores...\n");
            // Agregar elementos visuales al displayPane para representar Lista
        });
        pause.play();
    }


    // @FXML
    // public void handleAddToStack() {
    //     String data = inputField.getText();
    //     if (!data.isEmpty()) {
    //         pila.push(data);
    //         updateStackVisualization();
    //         inputField.clear();
    //     }
    // }

    // @FXML
    // public void handleAddToQueue() {
    //     String data = inputField.getText();
    //     if (!data.isEmpty()) {
    //         cola.enqueue(data);
    //         updateQueueVisualization();
    //         inputField.clear();
    //     }
    // }

    // private void updateStackVisualization() {
    //     stackContainer.getChildren().clear();
    //     stackContainer.getChildren().add(new Label("Pilas"));
    //     pila.getStack().forEach(item -> stackContainer.getChildren().add(new Label(item)));
    // }

    // private void updateQueueVisualization() {
    //     queueContainer.getChildren().clear();
    //     queueContainer.getChildren().add(new Label("Colas"));
    //     cola.getQueue().forEach(item -> queueContainer.getChildren().add(new Label(item)));
    // }
}

