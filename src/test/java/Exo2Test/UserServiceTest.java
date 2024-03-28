package Exo2Test;

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
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        // TODO : Configuration du comportement du mock, utiliser la
        //directive « when » avec sa méthode « thenReturn »
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenReturn(true);

        // ...
        // TODO : Création du service avec le mock
        // ...
        UserService service  = mock(UserService.class);
        when(service.creerUtilisateur(utilisateur)).thenReturn(true);
        // TODO : Appel de la méthode à tester
        boolean result  = service.creerUtilisateur(utilisateur);


        // TODO : Vérification de l'appel à l'API
        // ...
        Assertions.assertEquals(true,result);
        verify(service).creerUtilisateur(utilisateur);
    }
}