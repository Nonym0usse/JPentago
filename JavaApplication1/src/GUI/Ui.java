/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color; 
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hadji
 */
public class Ui extends JPanel{
      private JPanel pan = new JPanel();
      private JButton jouer = new JButton("Jouer");
      private JButton regle = new JButton("Lire les règles");
    
    public void windows(){  
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Projet Jpentago");
        fenetre.setSize(1920, 1080);
        fenetre.setLocationRelativeTo(null); 
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan.add(jouer);
        pan.add(regle);
        fenetre.setContentPane(pan);              
        fenetre.setVisible(true);
    }
    
    public void HomeUi(){
        
    }
    
    public void paintComponent(Graphics g){
    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
    System.out.println("Je suis exécutée !"); 
    g.fillOval(20, 20, 75, 75);
  }    
}
