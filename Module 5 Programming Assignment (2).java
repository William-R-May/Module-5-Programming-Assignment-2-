import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeCircleColor extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle with initial color white
        Circle circle = new Circle(150, 150, 80);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Pane pane = new Pane(circle);

        // Event handler: mouse pressed → circle turns black
        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));

        // Event handler: mouse released → circle turns white
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Change Circle Color with Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
