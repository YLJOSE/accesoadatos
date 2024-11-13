package SubsistemaGestionUsuarios;

public class User {
    private long id;
    private long id_user;
    private String password;
    private String dateTimeLastAccessCorrect;
    private String dateTimeLastAccessIncorrect;
    private String typeUser;
    private boolean isActive = true;

    public User(long id, long id_user, String password, String dateTimeLastAccessCorrect, String dateTimeLastAccessIncorrect, String typeUser, boolean isActive) {
        this.id = id;
        this.id_user = id_user;
        this.password = password;
        this.dateTimeLastAccessCorrect = dateTimeLastAccessCorrect;
        this.dateTimeLastAccessIncorrect = dateTimeLastAccessIncorrect;
        this.typeUser = typeUser;
        this.isActive = isActive;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateTimeLastAccessCorrect() {
        return dateTimeLastAccessCorrect;
    }

    public void setDateTimeLastAccessCorrect(String dateTimeLastAccessCorrect) {
        this.dateTimeLastAccessCorrect = dateTimeLastAccessCorrect;
    }

    public String getDateTimeLastAccessIncorrect() {
        return dateTimeLastAccessIncorrect;
    }

    public void setDateTimeLastAccessIncorrect(String dateTimeLastAccessIncorrect) {
        this.dateTimeLastAccessIncorrect = dateTimeLastAccessIncorrect;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


}
