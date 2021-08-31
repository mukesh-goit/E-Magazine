package application;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
public class Main extends Application {
	@Override
	public void start(Stage myStage) throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene myscene=new Scene(root);
		myStage.setScene(myscene);
		myStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
