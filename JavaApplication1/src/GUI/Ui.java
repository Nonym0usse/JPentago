/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Jeu.Jeu;
import Joueur.Joueur;
import java.awt.Color; 
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
        System.out.println(Map.get(0));
    }
    
    
    public void readregle(){
        vider();
        JLabel label = new JLabel(" Mettre les règles ");
        pan.add(label);
    }
    
    public void paintComponent(Graphics g){
    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
    System.out.println("Je suis exécutée !"); 
    g.fillOval(20, 20, 75, 75);
  }    
}
