
import java.io.File;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Addprod extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        
        Label StockLab = new Label("StockLab");
        StockLab.getStyleClass().add("StockLab-style"); 
        
        Label Add = new Label("Add product");
        Add.getStyleClass().add("Add-style"); 
        Add.setStyle("-fx-font-size: 24px;");
        
        Label Photo = new Label("Photo");
        Photo.getStyleClass().add("Photo-style"); 
        Photo.setStyle("-fx-font-size: 20px;");

        Label Gmailst = new Label("Stocklab.client@sttest.ma");
        Gmailst.getStyleClass().add("Gmailst-style"); 
        
        
        Label Phonest = new Label("0523548160");
        Phonest.getStyleClass().add("Phonest-style"); 
        
        TextField Name_prod = new TextField();
        Name_prod.setPromptText("Name");
        Name_prod.getStyleClass().add("Name_prod");
     
        
        
        Rectangle rectangle = new Rectangle(360, 50);
        rectangle.getStyleClass().add("rectangle-style");
        
        Rectangle rectanglesefli = new Rectangle(360,90);
        rectanglesefli.getStyleClass().add("rectanglesefli-style");
        rectanglesefli.setArcWidth(65); 
        rectanglesefli.setArcHeight(65); 
        
        Rectangle rectangleBlur = new Rectangle(100,15);
        rectangleBlur.getStyleClass().add("rectangleBlur-Style");
        rectangleBlur.setArcWidth(00); 
        rectangleBlur.setArcHeight(00); 
        
        
        Rectangle rectanglerose = new Rectangle(174, 174);
        rectanglerose.setFill(Color.valueOf("#FFA3A3"));
        BoxBlur blur = new BoxBlur(113,113,113); 
        rectanglerose.setEffect(blur);
        
        
        Rectangle rectanglezre9 = new Rectangle(174, 174);
        rectanglezre9.setFill(Color.valueOf("#A3FFE9"));
        rectanglezre9.setEffect(blur);
        
        Rectangle rectanglekhder = new Rectangle(174, 174);
        rectanglekhder.setFill(Color.valueOf("#A3FFA6"));
        rectanglekhder.setEffect(blur);
        
        Rectangle rectangleprod = new Rectangle(140, 130);
        rectangleprod.setFill(Color.WHITE);
        rectangleprod.setStroke(Color.web("#252525"));  
        rectangleprod.setStrokeWidth(0.5);
        rectangleprod.setEffect(new javafx.scene.effect.DropShadow(5, 0, 5, Color.rgb(254, 183, 0, 0.4)));
        rectangleprod.setArcWidth(20);
        rectangleprod.setArcHeight(20);
        
        
        
        
        TextArea descriptionTextArea = new TextArea();
        descriptionTextArea.setWrapText(true);
        descriptionTextArea.setPromptText("Description ");

        // Taille du TextArea
        descriptionTextArea.setMaxSize(305,100);
        descriptionTextArea.getStyleClass().add("text-area-style");


        
        TextField textField = new TextField();
        textField.setPromptText("Prix");
        textField.getStyleClass().add("empty-textfield"); 
     
        Rectangle rectangprice = new Rectangle(50, 18.5);
        rectangprice.getStyleClass().add("rectangprice-style");
        
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
        );
        
        
        
        Circle circleadd = new Circle();
        circleadd.setRadius(17);
        circleadd.getStyleClass().add("circleadd-style");
        
        
        Label photoLabel = new Label("Photo");
        photoLabel.getStyleClass().add("Photo-style");
        photoLabel.setStyle("-fx-font-size: 20px;");
        
        
        Button ResetButton = new Button("Reset");
        ResetButton.setOnAction(e -> {
        	Name_prod.setText("");
            textField.setText("");
            descriptionTextArea.setText("");
            rectangleprod.setFill(Color.WHITE); // Réinitialise la couleur de fond du rectangleprod
            Photo.setVisible(true); // Affiche à nouveau le texte "Photo"

        });
        
        ResetButton.getStyleClass().add("ResetButton-style");
        
        
        
        Button BackButton = new Button("Back");
        BackButton.getStyleClass().add("Add_a_product-style");
        BackButton.setOnAction(e -> {
        	Choix Logout = new Choix();
            Stage stage = new Stage();
            Logout.start(stage);
            Stage currentStage = (Stage) BackButton.getScene().getWindow();
            currentStage.close();

        });
        
        BackButton.getStyleClass().add("ResetButton-style");
        
        
        Button AddButton = new Button("Add");
        AddButton.getStyleClass().add("Add_a_product-style");
        AddButton.setOnAction(e -> {
        

        });
        
        AddButton.getStyleClass().add("ResetButton-style");
        
        
        
        Image image1 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logowhit.png");
        ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logoblack.png");
        ImageView imageView2 = new ImageView(image2);
        
        Image image3 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\Group 5.png");
        ImageView imageView3 = new ImageView(image3); 
        
        Image image4 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\Group 17.png");
        ImageView imageView4 = new ImageView(image4);
       
        Image image5 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\love-and-help.png");
        ImageView imageView5 = new ImageView(image5);
      
        
        
        StackPane root = new StackPane();
        
        
        var options = FXCollections.observableArrayList("Xiaomi", "Samsung", "Apple", "Nokia", "Huawei");

        SpinnerValueFactory<String> valueFactory = new SpinnerValueFactory.ListSpinnerValueFactory<>(options);

        Spinner<String> spinner = new Spinner<>(valueFactory);
        spinner.setStyle("-fx-pref-width: 130px;-fx-background-color: #FFF;-fx-border-radius: 3px;fx-border-width: 0.12px;-fx-border-color: #323232;");
        
        
        
        root.getChildren().addAll(rectanglerose,
        		rectanglezre9,
        		rectanglekhder,
        		rectangle,
        		rectanglesefli,
        		rectangleBlur,
        		imageView1,
        		imageView2,
        		imageView3,
        		imageView4,
        		StockLab,
        		Gmailst,
        		Phonest,
        		Add,
        		rectangleprod,
        		circleadd,
        		imageView5,
        		Photo,
        		Name_prod,
        		spinner,
        		rectangprice,
        		textField,
        		descriptionTextArea,
        		ResetButton,
        		BackButton,
        		AddButton
        		);
    
        
     
        
        BoxBlur boxBlur = new BoxBlur();
        boxBlur.setWidth(160);  
        boxBlur.setHeight(160);
        rectangleBlur.setEffect(boxBlur);
        
        Gmailst.setTranslateY(273.5);
        
        Phonest.setTranslateY(285.5);
        
        rectanglesefli.setTranslateX(0); 
        rectanglesefli.setTranslateY(285); 
        
        rectangleBlur.setTranslateX(0); 
        rectangleBlur.setTranslateY(265); 
        
        rectanglerose.setTranslateX(-130); 
        rectanglerose.setTranslateY(-300); 
        rectanglezre9.setTranslateX(120); 
        rectanglezre9.setTranslateY(285); 
        rectanglekhder.setTranslateX(200); 
        rectanglekhder.setTranslateY(-270);
        
        rectangle.setTranslateX(0); 
        rectangle.setTranslateY(-280); 
        
        rectangleprod.setTranslateX(-65); 
        rectangleprod.setTranslateY(-50); 
        
        imageView1.setTranslateX(0); 
        imageView1.setTranslateY(-274); 
        
        imageView2.setTranslateX(-100.25); 
        imageView2.setTranslateY(-200.5); 
        
        imageView3.setTranslateX(0); 
        imageView3.setTranslateY(235); 
        
        imageView4.setTranslateX(30); 
        imageView4.setTranslateY(-145); 
        
        
        Add.setTranslateX(-55);
        Add.setTranslateY(-145);
        
        Photo.setTranslateX(-65);
        Photo.setTranslateY(-50);
        
        circleadd.setTranslateX(-65);
        circleadd.setTranslateY(15);
        
        imageView5.setTranslateX(-65);
        imageView5.setTranslateY(15);
        
        rectangprice.setTranslateX(110);
        rectangprice.setTranslateY(-100);
        
        Name_prod.setTranslateX(90);
        Name_prod.setTranslateY(-65);
        
        spinner.setTranslateX(90);
        spinner.setTranslateY(-20);
        
        textField.setTranslateX(275);
        textField.setTranslateY(-100);
        
      
        descriptionTextArea.setTranslateX(0);
        descriptionTextArea.setTranslateY(85);
        
        ResetButton.setTranslateX(0);
        ResetButton.setTranslateY(165);
        
        BackButton.setTranslateX(-105);
        BackButton.setTranslateY(185);
        
        AddButton.setTranslateX(105);
        AddButton.setTranslateY(185);
        
        
        Scene scene = new Scene(root, 360,600);
        scene.getStylesheets().add(getClass().getResource("Styles4.css").toExternalForm());

        primaryStage.setTitle("Choix");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Photo.setOnMouseClicked(event -> {
            // Afficher la fenêtre de sélection de fichier
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                // Créer une nouvelle image avec le fichier sélectionné
                Image selectedImage = new Image(selectedFile.toURI().toString());

                // Appliquer l'image sélectionnée au rectangleprod
                rectangleprod.setFill(new ImagePattern(selectedImage));

                // Masquer le texte "Photo"
                Photo.setVisible(false);
            }
        });
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
