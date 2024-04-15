package Exo2;

import org.jetbrains.kotlin.protobuf.ServiceException;

public class UserService {
    private final UtilisateurApi utilisateurApi;
    public UserService(UtilisateurApi utilisateurApi) {
        this.utilisateurApi = utilisateurApi;
    }
    public boolean creerUtilisateur(Utilisateur utilisateur) throws ServiceException {
        utilisateurApi.creerUtilisateur(utilisateur);
        return true ;
    }

    public int getID() throws ServiceException{
        return utilisateurApi.getID();
    }
}
