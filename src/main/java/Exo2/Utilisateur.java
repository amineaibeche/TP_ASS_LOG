package Exo2;

public class Utilisateur {
    public String name ;
    public String lastname ;
    public  String mail;

    public Utilisateur(String name, String lastname, String mail) {
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return  name + ' ' +lastname + ' ' + mail ;
    }
}
