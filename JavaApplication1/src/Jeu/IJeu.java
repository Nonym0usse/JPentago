package Jeu;

public interface IJeu {
    public abstract void Init();
    public abstract void Process(Integer localisation, String direction);
    public abstract Integer Victory();
    public abstract void Ending();
}
