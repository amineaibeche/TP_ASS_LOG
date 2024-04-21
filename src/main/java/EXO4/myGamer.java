package EXO4;

public class myGamer implements joueur{
    @Override
    public int mise() {
        return 0;
    }

    @Override
    public boolean debiter(int somme) throws Exception {
        return true;
    }

    @Override
    public boolean crediter(int somme) {
        return true;
    }
}
