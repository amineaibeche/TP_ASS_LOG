package EXO4Test;
import EXO4.*;
import Exo2.UserService;
import Exo2.Utilisateur;
import Exo2.UtilisateurApi;
import org.jetbrains.kotlin.protobuf.ServiceException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class Test1 {
    @Mock
    private Banque banque;

    @Mock
    private joueur gamer;

    @Mock
    private De de ;

    @Mock
    private jeuu game ;
    // pour tester le premier senario
    @Test
    public void testGanier(){

    }

    @Test
    public void gameFermerTest() throws Exception {
        when(game.estOuvert()).thenReturn(true);
        when(game.fermer()).thenReturn(true);
        when(gamer.mise()).thenReturn(7000);
        when(gamer.debiter(7000*2)).thenReturn(true );
        when(banque.est_solvable()).thenReturn(true,true,false) ;
        when(de.lancer()).thenReturn(7 , 5) ;


        if(game.estOuvert()){
            int mise  = gamer.mise();
            gamer.debiter(mise);
            if(!banque.est_solvable()){
                boolean r = game.fermer();
                if(r){
                    System.out.println("end of the Game 1");
                }
            }else {
                int d1 = de.lancer();
                int d2 = de.lancer();
                if(d1 + d2 == 7 ){
                    if(banque.est_solvable())
                        if(game.fermer())
                            System.out.println("end of the Game 2");

                }else {
                    if(game.fermer())
                        System.out.println("end of the Game 3");
                }
            }
        }

    }

}
