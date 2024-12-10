package com.proyectoInf121;

import com.proyectoInf121.estructurasDeDatos.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    // @Override
    // public void start(Stage primaryStage) {
    //     TableView<Insumo> tableView = new TableView<>();

    //     TableColumn<Insumo, String> nameColumn = new TableColumn<>("Nombre");
    //     nameColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));

    //     TableColumn<Insumo, Integer> quantityColumn = new TableColumn<>("Cantidad");
    //     quantityColumn.setCellValueFactory(new PropertyValueFactory<>("cantidad"));

    //     tableView.getColumns().add(nameColumn);
    //     tableView.getColumns().add(quantityColumn);

    //     PilaI pila = new PilaI();
    //     pila.adicionar(new Insumo("medicamentos", 10));
    //     pila.adicionar(new Insumo("alimentos", 11));
    //     pila.adicionar(new Insumo("ropa", 12));

    //     while (!pila.esVacia()) {
    //         tableView.getItems().add(pila.eliminar());
    //     }

    //     VBox vbox = new VBox(tableView);
    //     Scene scene = new Scene(vbox);

    //     primaryStage.setScene(scene);
    //     primaryStage.setTitle("Contenido de la Pila");
    //     primaryStage.show();
    // }

    // public static void main(String[] args) {
    //     launch(args);
    // }
     @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/proyectoInf121/fxml/App.fxml" + //
                        ""));
        //AnchorPane root = loader.load();
        VBox root = loader.load();

        // Crear la escena y mostrar la ventana
        Scene scene = new Scene(root,800,600);
        primaryStage.setTitle("Gestión de Inversores");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
