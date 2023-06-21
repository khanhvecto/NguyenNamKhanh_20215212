package hust.soict.globalict.javafx;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.scene.*;

public class Painter extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/hust/soict/globalict/javafx/Painter.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}