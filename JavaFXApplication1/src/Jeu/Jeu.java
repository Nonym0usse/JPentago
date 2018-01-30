package Jeu;

import GUI.Ui;
import com.sun.javafx.scene.web.Debugger;
import java.util.ArrayList;

public class Jeu implements IJeu {

    public ArrayList HG = new ArrayList();
    public ArrayList HD = new ArrayList();
    public ArrayList BG = new ArrayList();
    public ArrayList BD = new ArrayList();
    public int indice1 = 0;
    public int indice2 = 0;
    public int indice3 = 0;
    public int indice4 = 0;

    ArrayList Map = new ArrayList();

    Ui gui = new Ui();

    
    public ArrayList Init() {
        for (int i = 0; i < 9; i++) {
            HG.add(0);
        }

        for (int i = 0; i < 9; i++) {
            HD.add(0);
        }

        for (int i = 0; i < 9; i++) {
            BG.add(0);
        }

        for (int i = 0; i < 9; i++) {
            BD.add(0);
        }
        Map.add(HG);
        Map.add(HD);
        Map.add(BG);
        Map.add(BD);
        // System.out.println(HG.get(0));
           return Map;
    }

    @Override
    public void Process(Integer localisation, String direction) { //permet de faire tourner

    }

    @Override
    public Integer Victory() {
        return 0;
    }

    @Override
    public void Ending() {

    }

}
