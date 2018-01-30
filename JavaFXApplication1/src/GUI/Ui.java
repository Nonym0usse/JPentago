/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Jeu.Jeu;
import Joueur.Joueur;
import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


/**
 *
 * @author hadji
 */
public class Ui extends Application{
      private Button jouer = new Button();
      private Button regle = new Button();
      public Joueur player1 = new Joueur("Joueur un", 0, "Bleu", 1);
      public Joueur player2 = new Joueur("Joueur deux", 0, "Rouge", 2);
      public GridPane root = new GridPane();
        public Text text = new Text();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JPentago");
        jouer.setText("Jouer");
        regle.setText("Regles");

        jouer.setOnAction(new EventHandler<javafx.event.ActionEvent>() {            
            @Override
            public void handle(javafx.event.ActionEvent event) {
                jouer(primaryStage);
            }
        });
        
        regle.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                readregle();
            }
        });
        
        VBox root = new VBox(2);
        root.getChildren().addAll(jouer, regle);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
  

    
    public void jouer(Stage primaryStage)
    {
        root.getChildren().removeAll();

        Image img = new Image("accueil-ynov.png");

        ImageView imgView = new ImageView(img);
        ImageView imgView2 = new ImageView(img);
        ImageView imgView3 = new ImageView(img);
        ImageView imgView4 = new ImageView(img);

        
        
        redimensionnement(imgView);
        redimensionnement(imgView2);
        redimensionnement(imgView3);
        redimensionnement(imgView4);
        VBox root = new VBox(imgView, imgView2, imgView3, imgView4);
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    
        ArrayList Map = new ArrayList();
        System.out.println(player2.getPseudo());
        Jeu jpentago = new Jeu();
        Map = jpentago.Init();
        afficher(Map);
    }
    
    public void redimensionnement(ImageView imgView)
    {
       imgView.setPreserveRatio(true);   
       imgView.setFitHeight(100); 
       imgView.setFitWidth(100);  
    }
    
    public void afficher(ArrayList mapconsole)
    {
        int nbpannel = mapconsole.size();
        System.out.println(nbpannel);
    }

    
    public void readregle(){
        String regles = "Voici les règles lorem ipsum latarae mes couilles et tout";
        text.setText(regles);
    }
}
