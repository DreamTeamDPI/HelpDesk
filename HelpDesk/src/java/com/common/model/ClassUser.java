/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.model;

import java.io.Serializable;
/**
 *
 * @author Konos
 */


public class ClassUser implements Serializable {

    private Long idUser;
 
    private String firstName;

    private String lastName;
   
    private String patronomic;
   
    private String password;
   
    private String login;
    
    private String numberPhone;

    private String email;
  
  
    private String roleidRole;

    public ClassUser() {
    }

    public ClassUser(Long idUser) {
        this.idUser = idUser;
    }

    public ClassUser( String roleidrole ) {
      
        this.roleidRole = roleidrole;
    }

    public ClassUser(User listUsers) {
        this.idUser = listUsers.getIdUser();
        this.firstName = listUsers.getFirstName();
        this.lastName = listUsers.getLastName();
        this.patronomic = listUsers.getPatronomic();
        this.password = listUsers.getPassword();
        this.login = listUsers.getLogin();
        this.numberPhone = listUsers.getNumberPhone();
        this.roleidRole = listUsers.getRoleidRole().getNameRole();
        this.numberPhone= listUsers.getNumberPhone();
        
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
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

    public String getRoleidRole() {
        return roleidRole;
    }

    public void setRoleidRole(String roleidRole) {
        this.roleidRole = roleidRole;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ClassUser{" + "idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", patronomic=" + patronomic + ", password=" + password + ", login=" + login + ", numberPhone=" + numberPhone + ", email=" + email + ", roleidRole=" + roleidRole + '}';
    }

  
   
    
}

