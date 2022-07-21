

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class circle_button extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Circle c = new Circle(30);
        c.setFill(Color.TRANSPARENT);
        c.setStroke(Color.BLACK);

        Button b1 = new Button("Enlarge");
        Button b2 = new Button("Shrink");

        HBox h = new HBox();
        h.getChildren().addAll(b1, b2);
        h.setSpacing(10);
        h.setAlignment(Pos.CENTER);
        h.setPadding(new Insets(10));

        BorderPane pane = new BorderPane();
        pane.setCenter(c);
        pane.setBottom(h);

        b1.setOnAction(e -> {
            c.setRadius(c.getRadius() + 10);
        });
        b2.setOnAction(e -> {
            c.setRadius(c.getRadius() - 10);
        });

        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}