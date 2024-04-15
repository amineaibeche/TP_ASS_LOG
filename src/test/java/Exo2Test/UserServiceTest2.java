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
public class UserServiceTest2 {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void creeUtilisateureTest() throws ServiceException {
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com",123);
        //utilisateurApiMock = mock(utilisateurApiMock, withSettings().id(123));
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenReturn(true);
        // Définition d'un ID fictif
        int idUtilisateur = 123;
        // TODO: Configuration du mock pour renvoyer l'ID
        when(utilisateurApiMock.getID() ).thenReturn(idUtilisateur);

        // Appel de la méthode à tester
        UserService userService = mock(UserService.class);
        when(userService.getID() ).thenReturn(idUtilisateur);
        userService.creerUtilisateur(utilisateur);
        // TODO: Vérification de l'ID de l'utilisateur
        //..
        int result = userService.getID();
        verify(userService).getID();
        Assertions.assertEquals(result , 123);
    }
}
