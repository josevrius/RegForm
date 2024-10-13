package org.jvrb.java.regform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class RegFormApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegFormApplication.class.getResource("regform-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 430);
        stage.setTitle("Jose V. Rius - Formulario de Registro");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image("File:icon.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}