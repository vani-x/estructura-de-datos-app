package com.proyectoInf121.controllers;



// import com.proyectoInf121.structures.Pila;
// import com.proyectoInf121.structures.Cola;
import com.proyectoInf121.estructurasDeDatos.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class AppController {

    @FXML
    private Pane displayPane; // Panel donde se dibujarán las estructuras de datos
    @FXML
    private TextArea displayArea; // Área para texto descriptivo
    
    @FXML
    private VBox stackContainer;

    @FXML
    private VBox queueContainer;

    @FXML
    private TextField inputField;




    private MultiColaP multiColaVisitantes;
    private PilaP pilaPedidos;
    private LSimpleE listaEmprendedores;

    public void initialize() {
        inicializarDatos();
    }

    private void inicializarDatos() {
        multiColaVisitantes = cargarDatos.cargarDatosMultiColaP();
        pilaPedidos = cargarDatos.cargarDatosPilaPedidos();
        listaEmprendedores = cargarDatos.cargarDatosListaEmprendedores();
    }

    @FXML
    private void handleVisualizarDatos() {
        displayPane.getChildren().clear(); // Limpiar el panel de visualización
        animarMultiCola();
        //animarPila();
        //animarListaEmprendedores();
    }

    private void animarMultiCola() {
        displayPane.getChildren().clear(); // Limpiar el panel antes de dibujar
        // PauseTransition pause = new PauseTransition(Duration.seconds(1));
        // pause.setOnFinished(event -> {
        //     //displayArea.appendText("Visualizando MultiCola de Visitantes...\n");
        Timeline timeline = new Timeline();    
        int delayCounter = 0; // Contador para incrementar el tiempo de retraso
            // Crear visualización para cada elemento de MultiCola
            for (int i = 0; i < multiColaVisitantes.getN(); i++) {
                CSimpleP cola = multiColaVisitantes.getV()[i];
                CSimpleP aux=new CSimpleP();
                
                int columnIndex = i; // Índice de columna para posicionar los elementos
                int[] elementPosition = {0}; // Mantener la posición actual en la fila (horizontal)

               // int yPosition = 50 + (i - 1) * 60; // Espaciado vertical entre colas

                while (!cola.esVacia()) {
                    Persona persona = cola.eliminar(); // Obtener elemento
                    int currentDelay = delayCounter++; // Retrasar cada nodo adicionalmente

                    KeyFrame keyFrame = new KeyFrame(
                            Duration.seconds(currentDelay * 0.5), // Duración progresiva para cada nodo
                            event -> {
                                // Crear un círculo para representar el visitante
                                Circle circle = new Circle(20);
                                circle.setFill(Color.LIGHTBLUE);
                                circle.setStroke(Color.BLACK);

                                // Posicionar el círculo
                                circle.setLayoutX(50 + elementPosition[0] * 60);
                                circle.setLayoutY(50 + columnIndex * 60);

                                 // Incrementar la posición horizontal en la fila
                                 elementPosition[0]++;
                                // Agregar el círculo al panel
                                displayPane.getChildren().add(circle);

                                // Agregar un texto dentro del círculo (opcional)
                                Label text = new Label(persona.getNombre());
                                text.setStyle("-fx-font-weight: bold; -fx-text-fill: black;");
                                text.setLayoutX(circle.getLayoutX() - 10);
                                text.setLayoutY(circle.getLayoutY() - 10);
                                displayPane.getChildren().add(text);
                            }
                    );
                    timeline.getKeyFrames().add(keyFrame);
                }
                cola.vaciar(aux);
              }
          
          timeline.play();
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


    @FXML
    public void handleAddToStack() {
        // String data = inputField.getText();
        // if (!data.isEmpty()) {
        //     pila.push(data);
        //     updateStackVisualization();
        //     inputField.clear();
        // }
    }

    @FXML
    public void handleAddToQueue() {
        // String data = inputField.getText();
        // if (!data.isEmpty()) {
        //     cola.enqueue(data);
        //     updateQueueVisualization();
        //     inputField.clear();
        // }
    }

    private void updateStackVisualization() {
        // stackContainer.getChildren().clear();
        // stackContainer.getChildren().add(new Label("Pilas"));
        // pila.getStack().forEach(item -> stackContainer.getChildren().add(new Label(item)));
    }

    private void updateQueueVisualization() {
        // queueContainer.getChildren().clear();
        // queueContainer.getChildren().add(new Label("Colas"));
        // cola.getQueue().forEach(item -> queueContainer.getChildren().add(new Label(item)));
    }
}

