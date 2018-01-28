package Jeu;

import java.util.ArrayList;

public interface IJeu {
    public abstract ArrayList Init();
    public abstract void Process(Integer localisation, String direction);
    public abstract Integer Victory();
    public abstract void Ending();
}
