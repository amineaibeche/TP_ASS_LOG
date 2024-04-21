package EXO4;

public class myGame implements jeuu {
    @Override
    public void Jeu(Banque labanque) {

    }

    @Override
    public void jouer(joueur joue, De de1, De de2) throws Exception {
        int d1 = de1.lancer();
        int d2 = de2.lancer();
        int m = joue.mise();
        if(d1 + d2 == 7){
            joue.debiter(m);
        }else {
            joue.crediter(m);
        }
    }

    @Override
    public boolean fermer() {
        System.out.println("end of the game ");
        return true;
    }

    @Override
    public boolean estOuvert() {
        return false;
    }
}
