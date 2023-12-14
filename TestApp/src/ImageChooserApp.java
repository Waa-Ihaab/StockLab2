import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;

import java.io.File;

public class ImageChooserApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        // Créer le rectangle
        Rectangle rectangle = new Rectangle(32, 32);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.web("#252525"));
        rectangle.setStrokeWidth(0.19);
        rectangle.setEffect(new javafx.scene.effect.DropShadow(2, 2, 2, Color.rgb(254, 183, 0, 0.34)));

        // Créer le bouton de sélection d'image
        Button chooseImageButton = new Button("Choisir une image");
        chooseImageButton.setOnAction(e -> chooseImage(rectangle));

        // Ajouter le rectangle et le bouton au conteneur principal
        root.getChildren().addAll(rectangle, chooseImageButton);

        // Configurer la scène
        Scene scene = new Scene(root, 200, 200);
        primaryStage.setTitle("Image Chooser");
        primaryStage.setScene(scene);

        // Afficher la fenêtre
        primaryStage.show();
    }

    // Méthode pour choisir une image et l'afficher dans le rectangle
    private void chooseImage(Rectangle rectangle) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choisir une image");
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            // Charger l'image depuis le fichier choisi
            Image image = new Image(file.toURI().toString());

            // Créer une ImageView pour afficher l'image
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(rectangle.getWidth()); // Ajuster la largeur à celle du rectangle
            imageView.setFitHeight(rectangle.getHeight()); // Ajuster la hauteur à celle du rectangle

            // Remplacer le contenu du rectangle par l'ImageView
            StackPane root = (StackPane) rectangle.getScene().getRoot(); // Récupérer le conteneur parent
            root.getChildren().remove(rectangle); // Supprimer le rectangle du conteneur
            root.getChildren().add(imageView); // Ajouter l'ImageView à la place du rectangle
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
