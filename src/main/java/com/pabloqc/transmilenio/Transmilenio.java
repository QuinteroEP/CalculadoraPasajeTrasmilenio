//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pabloqc.transmilenio;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Transmilenio extends Application {
    public Transmilenio() {
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Transmilenio.class.getResource("Pantalla.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load(), 371.0, 330.0);
        stage.setTitle("Calculador de pasaje");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(new String[0]);
    }
}
