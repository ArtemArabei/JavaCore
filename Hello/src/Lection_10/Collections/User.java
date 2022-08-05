package Lection_10.Collections;

import java.time.LocalDate;

public class User {

    private String login;
    private String password;
    LocalDate createdDate;

    User(String login, String password, LocalDate createdDate) {
        this.login = login;
        this.password = password;
        this.createdDate = createdDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
