
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Choix extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        
        Label StockLab = new Label("StockLab");
        StockLab.getStyleClass().add("StockLab-style"); 
        
        Label Hey = new Label("Hey There !");
        StockLab.getStyleClass().add("Hey-style"); 
        Hey.setStyle("-fx-font-size: 24px;");
        
        Label ugrade = new Label("Ugrade your store");
        StockLab.getStyleClass().add("Ugrade-style"); 
        ugrade.setStyle("-fx-font-size: 24px;");

        Label Gmailst = new Label("Stocklab.client@sttest.ma");
        Gmailst.getStyleClass().add("Gmailst-style"); 
        
        
        Label Phonest = new Label("0523548160");
        Phonest.getStyleClass().add("Phonest-style"); 
        
       
        
        
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
        
       
        
        Image image1 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logowhit.png");
        ImageView imageView1 = new ImageView(image1);

        Image image2 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\logoblack.png");
        ImageView imageView2 = new ImageView(image2);
        
        Image image3 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\Group 5.png");
        ImageView imageView3 = new ImageView(image3);
        
        Image image4 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\add-four.png");
        ImageView imageView4 = new ImageView(image4);
        
        Image image5 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\write.png");
        ImageView imageView5 = new ImageView(image5);
        
        Image image6 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\delete-four.png");
        ImageView imageView6 = new ImageView(image6);
        
        Image image7 = new Image("file:C:\\Users\\PC\\OneDrive\\Bureau\\TestApp\\reject.png");
        ImageView imageView7 = new ImageView(image7);
      
      
        Button Add_a_product = new Button("Add a product");
        Add_a_product.getStyleClass().add("Add_a_product-style");
        Add_a_product.setOnAction(e -> {
        	Addprod Logout = new Addprod();
            Stage stage = new Stage();
            Logout.start(stage);
            Stage currentStage = (Stage) Add_a_product.getScene().getWindow();
            currentStage.close();

        });
        
        Button Edit_a_product = new Button("Edit a product");
        Edit_a_product.getStyleClass().add("Edit_a_product-style");
        
        Button Delete_a_product = new Button("Delete a product");
        Delete_a_product.getStyleClass().add("Delete_a_product-style");
      
        Button Log_out = new Button("Log out");
        Log_out.getStyleClass().add("Log_out-style");
        Log_out.setOnAction(e -> {
        	MainInter Logout = new MainInter();
            Stage stage = new Stage();
            Logout.start(stage);
            Stage currentStage = (Stage) Log_out.getScene().getWindow();
            currentStage.close();

        });
        
        
        StackPane root = new StackPane();
        
        root.getChildren().addAll(rectanglerose,
        		rectanglezre9,
        		rectanglekhder,
        		rectangle,
        		rectanglesefli,
        		rectangleBlur,
        		imageView1,
        		imageView2,
        		imageView3,
        		StockLab,
        		Gmailst,
        		Phonest,
        		Add_a_product,
        		Edit_a_product,
        		Delete_a_product,
        		Log_out,
        		imageView4,
        		imageView5,
        		imageView6,
        		imageView7,
        		Hey,
        		ugrade
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
        
        imageView1.setTranslateX(0); 
        imageView1.setTranslateY(-274); 
        
        imageView2.setTranslateX(-100.25); 
        imageView2.setTranslateY(-200.5); 
        
        imageView3.setTranslateX(0); 
        imageView3.setTranslateY(235); 
        
        Add_a_product.setTranslateX(0);
        Add_a_product.setTranslateY(-75); 
        
        imageView4.setTranslateX(85);
        imageView4.setTranslateY(-75);
        
        Edit_a_product.setTranslateX(0);
        Edit_a_product.setTranslateY(-5); 
        
        imageView5.setTranslateX(85);
        imageView5.setTranslateY(-5);
        
        Delete_a_product.setTranslateX(0);
        Delete_a_product.setTranslateY(65); 
        
        imageView6.setTranslateX(85);
        imageView6.setTranslateY(65);
        
        Log_out.setTranslateY(Log_out.getTranslateY() + 135);
        
        imageView7.setTranslateX(50);
        imageView7.setTranslateY(135);
        
        Hey.setTranslateX(-55);
        Hey.setTranslateY(-145);
      
        ugrade.setTranslateX(-20);
        ugrade.setTranslateY(-120);
        
        Scene scene = new Scene(root, 360,600);
        scene.getStylesheets().add(getClass().getResource("Styles3.css").toExternalForm());

        primaryStage.setTitle("Choix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
