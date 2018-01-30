/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Jeu.Jeu;
import Joueur.Joueur;
import java.awt.Color;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.shape.*;
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
        primaryStage.setScene(new Scene(root, 1000, 1000));
        primaryStage.show();
    }
  
    public void jouer(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000);
        Group g = new Group();
        
        Rectangle rect = new Rectangle(290,140,200,200);
        Rectangle rect2 = new Rectangle(290,350,200,200);
        Rectangle rect3 = new Rectangle(500,140,200,200);
        Rectangle rect4 = new Rectangle(500,350,200,200);

        g.getChildren().addAll(rect, rect2, rect3, rect4);
        root.getChildren().add(g);
        primaryStage.setScene(scene);
        primaryStage.show();
    
        ArrayList Map = new ArrayList();
        System.out.println(player2.getPseudo());
        Jeu jpentago = new Jeu();
        Map = jpentago.Init();
        afficher(Map);
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
