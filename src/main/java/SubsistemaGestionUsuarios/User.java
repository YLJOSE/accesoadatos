package SubsistemaGestionUsuarios;

public class User {
    private String id_user;
    private String password;
    private String dateTimeLastAccessCorrect;
    private String dateTimeLastAccessIncorrect;
    private String typeUser;
    private boolean isActive = true;

    public User(String id_user, String password, String dateTimeLastAccessCorrect, String dateTimeLastAccessIncorrect, String typeUser) {
        this.id_user = id_user;
        this.password = password;
        this.dateTimeLastAccessCorrect = dateTimeLastAccessCorrect;
        this.dateTimeLastAccessIncorrect = dateTimeLastAccessIncorrect;
        this.typeUser = typeUser;
    }

    public String getId_user() {
        return id_user;
    }

    public String getPassword() {
        return password;
    }

    public String getTypeUser() {
        return typeUser;
    }

}
