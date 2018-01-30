/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joueur;

/**
 *
 * @author nonym0usse
 */
public class Joueur {
    
    String Pseudo;
    Integer Score;
    String Couleur;
    Integer id;
 
    public Joueur(String Pseudo, Integer Score, String Couleur, Integer id)
    {
        this.Pseudo = Pseudo;
        this.Score = Score;
        this.Couleur = Couleur;
        this.id = id;
    }
    
    public String getPseudo()
    {
        return this.Pseudo;
    }
    
    public Integer getScore()
    {
        return this.Score;
    }
    
    public String getCouleur()
    {
        return this.Couleur;
    }
    
    public Integer getId()
    {
        return this.id;
    }
    
    public void setPseudo(String setPseudo)
    {
        this.Pseudo = setPseudo;
    }
    
    public void setScore(Integer setScore)
    {
        this.Score = setScore;
    }
    
    public void setCouleur(String setCouleur)
    {
        this.Couleur = setCouleur;
    }
    
    public void setId(Integer setId)
    {
        this.id = setId;
    }
}
