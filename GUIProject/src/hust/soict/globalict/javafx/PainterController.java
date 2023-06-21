package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
	private Color color = Color.BLACK;
	private int size = 4;
	
    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    void choosePen(MouseEvent event) {
    	color = Color.BLACK;
    	size = 4;
    }

    @FXML
    void chooseEraser(MouseEvent event) {
    	color = Color.WHITE;
    	size = 10;
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), size, color);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    
}
