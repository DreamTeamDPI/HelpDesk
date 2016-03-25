package com.common.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by SemmEs on 06.03.2016.
 */
public class ClassUser implements Serializable {

    @NotNull
    private int idUser;

    @Size(min=2)
    private String firstName;

    private String lastName;

    private String patronomic;

    private String password;

    private String login;

    private String numberPhone;

    private String email;

    private int roleidRole;

    public ClassUser() {
    }

    public ClassUser(int idUser) {
        this.idUser = idUser;
    }

    public ClassUser(User listUsers) {
        this.idUser = listUsers.getIdUser();
        this.firstName = listUsers.getFirstName();
        this.lastName = listUsers.getLastName();
        this.patronomic = listUsers.getPatronomic();
        this.password = listUsers.getPassword();
        this.login = listUsers.getLogin();
        this.numberPhone = listUsers.getNumberPhone();
        this.roleidRole = listUsers.getRoleIdRole();
        this.numberPhone = listUsers.getNumberPhone();

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleidRole() {
        return roleidRole;
    }

    public void setRoleidRole(int roleidRole) {
        this.roleidRole = roleidRole;
    }


    @Override
    public String toString() {
        return "ClassUser{" + "idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", patronomic=" + patronomic + ", password=" + password + ", login=" + login + ", numberPhone=" + numberPhone + ", email=" + email + ", roleidRole=" + roleidRole + '}';
    }


}