package com.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SemmEs on 04.03.2016.
 */
@Entity
public class User {

    private int idUser;
    private String firstName;
    private String lastName;
    private String patronomic;
    private String password;
    private String login;
    private String numberPhone;
    private String email;
    private int roleIdRole;

    public User() {
    }

    public User(ClassUser type) {
        if (type.getIdUser() != -1) {
            this.idUser = type.getIdUser();
        }
        this.firstName = type.getFirstName();
        this.lastName = type.getLastName();
        this.patronomic = type.getPatronomic();
        this.password = type.getPassword();
        this.numberPhone = type.getNumberPhone();
        this.login = type.getLogin();
        this.roleIdRole = type.getRoleidRole();
    }


    @Id
    @Column(name = "idUser", nullable = true)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "patronomic")
    public String getPatronomic() {
        return patronomic;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "numberPhone")
    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Role_idRole")
    public int getRoleIdRole() {
        return roleIdRole;
    }

    public void setRoleIdRole(int roleIdRole) {
        this.roleIdRole = roleIdRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (idUser != user.idUser) return false;
        if (roleIdRole != user.roleIdRole) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (patronomic != null ? !patronomic.equals(user.patronomic) : user.patronomic != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (numberPhone != null ? !numberPhone.equals(user.numberPhone) : user.numberPhone != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (patronomic != null ? patronomic.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (numberPhone != null ? numberPhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + roleIdRole;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronomic='" + patronomic + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                ", roleIdRole=" + roleIdRole +
                '}';
    }
}
