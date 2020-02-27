package testSpring.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private Integer idUser;
    private String login;
    private String firstname;
    private String lastname;
    private boolean active;

    public Users() {}

    public Users(Integer idUser, String login, String firstname, String lastname, boolean active) {
        this.idUser = idUser;
        this.login = login;
        this.firstname = firstname;
        this.lastname = lastname;
        this.active = active;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer id_user) {
        this.idUser = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id_user=" + idUser +
                ", login='" + login + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", active=" + active +
                '}';
    }
}
