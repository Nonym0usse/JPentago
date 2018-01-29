/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Jeu.Jeu;
import Joueur.Joueur;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import static javafx.application.Platform.exit;
import javax.imageio.ImageIO;


/**
 *
 * @author hadji
 */
public class Ui extends JPanel{
      private JPanel pan = new JPanel();
      private JButton jouer = new JButton("Jouer");
      private JButton regle = new JButton("Lire les règles");
      private JFrame fenetre = new JFrame();
      private JLabel text = new JLabel();
      public Joueur player1 = new Joueur("Joueur un", 0, "Bleu", 1);
      public Joueur player2 = new Joueur("Joueur deux", 0, "Rouge", 2);
      
    public void windows()
    {  
        fenetre.setTitle("Projet Jpentago");
        fenetre.setSize(1920, 1080);
        fenetre.setLocationRelativeTo(null); 
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.add(jouer);
        pan.add(regle);
        fenetre.setContentPane(pan);              
        fenetre.setVisible(true);
    }
    
    public void actionButton(){
    jouer.addActionListener((ActionEvent e) -> {
        jouer();
    });
    regle.addActionListener((ActionEvent e) -> {
        readregle();
    });
   }
    
    public void vider(){
        pan.removeAll();
        pan.revalidate();
        pan.repaint();
    }
    
    public void jouer()
    {
        vider();
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
        Graphics graphics = pan.getGraphics();
        pan.repaint();
    }

    
    public void readregle(){
        vider();
        JLabel label = new JLabel(" Mettre les règles ");
        pan.add(label);
    }
    
    public void paintComponent(Graphics g){
     try {
    super.paintComponent(g);
      Image img = ImageIO.read(new File("3.jpg"));
      g.drawImage(img, 0, 0, this);
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("pasd ok");
    }   
  }
}
