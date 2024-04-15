package Exo2;

import org.jetbrains.kotlin.protobuf.ServiceException;

public interface UtilisateurApi {
    boolean creerUtilisateur(Utilisateur utilisateur) throws ServiceException;
    int getID() throws ServiceException;
}
