import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Testspinner  extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle Recdesc = new Rectangle(305, 105);
        Recdesc.setFill(Color.WHITE);
        Recdesc.setStroke(Color.web("#2E2E2E"));
        Recdesc.setStrokeWidth(1);
        Recdesc.setArcWidth(15);
        Recdesc.setArcHeight(15);
        Recdesc.setEffect(new javafx.scene.effect.BoxBlur(4, 15, 0));

        StackPane stackPane = new StackPane();

        TextArea descriptionTextArea = new TextArea();
        descriptionTextArea.setWrapText(true);
        descriptionTextArea.setPromptText("Ecrivez votre description ici...");
        descriptionTextArea.setMaxSize(Recdesc.getWidth() - 20, Recdesc.getHeight() - 20); // Taille du TextArea

        stackPane.getChildren().addAll(Recdesc, descriptionTextArea);

        Scene scene = new Scene(stackPane, 360, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
