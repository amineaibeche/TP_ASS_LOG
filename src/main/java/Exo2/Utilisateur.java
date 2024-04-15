package Exo2;

public class Utilisateur {
    public String name ;
    public String lastname ;
    public  String mail;
    public int IDu ;

    public Utilisateur(String name, String lastname, String mail ,int IDu) {
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.IDu = IDu;
    }

    @Override
    public String toString() {
        return  name + ' ' +lastname + ' ' + mail ;
    }
    public int getIDu(){
        return this.IDu;
    }
}
