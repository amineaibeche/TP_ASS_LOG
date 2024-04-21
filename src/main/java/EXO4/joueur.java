package EXO4;

public interface joueur {
    public int mise(); // on suppose que mise positive
    public boolean debiter(int somme) throws Exception;
    public boolean crediter(int somme);
}


