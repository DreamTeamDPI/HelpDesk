/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.common.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Konos
 */
@Entity
@Table(name = "user", catalog = "HelpDesk", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByIdUser", query = "SELECT u FROM User u WHERE u.idUser = :idUser"),
    @NamedQuery(name = "User.findByFirstName", query = "SELECT u FROM User u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "User.findByLastName", query = "SELECT u FROM User u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "User.findByPatronomic", query = "SELECT u FROM User u WHERE u.patronomic = :patronomic"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByLogin", query = "SELECT u FROM User u WHERE u.login = :login"),
    @NamedQuery(name = "User.findByNumberPhone", query = "SELECT u FROM User u WHERE u.numberPhone = :numberPhone"),
    @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUser", nullable = false)
    private Long idUser;
    @Column(name = "firstName", length = 45)
    private String firstName;
    @Column(name = "lastName", length = 45)
    private String lastName;
    @Column(name = "patronomic", length = 45)
    private String patronomic;
    @Basic(optional = false)
    @Column(name = "password", nullable = false, length = 20)
    private String password;
    @Basic(optional = false)
    @Column(name = "login", nullable = false, length = 20)
    private String login;
    @Column(name = "numberPhone", length = 45)
    private String numberPhone;
    @Column(name = "email", length = 45)
    private String email;
    @OneToMany(mappedBy = "useridUser")
    private Set<UserHasTickets> userHasTicketsSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "useridUser")
    private Set<Client> clientSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "useridUser")
    private Set<Employer> employerSet;
    @JoinColumn(name = "Role_idRole", referencedColumnName = "idRole", nullable = false)
    @ManyToOne(optional = false)
    private Role roleidRole;

    public User() {
        this.idUser = new Long(20);
    }

    public User(Long idUser) {
        this.idUser = idUser;
    }

    public User(Long idUser, String password, String login) {
        this.idUser = idUser;
        this.password = password;
        this.login = login;
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

    @XmlTransient
    public Set<UserHasTickets> getUserHasTicketsSet() {
        return userHasTicketsSet;
    }

    public void setUserHasTicketsSet(Set<UserHasTickets> userHasTicketsSet) {
        this.userHasTicketsSet = userHasTicketsSet;
    }

    @XmlTransient
    public Set<Client> getClientSet() {
        return clientSet;
    }

    public void setClientSet(Set<Client> clientSet) {
        this.clientSet = clientSet;
    }

    @XmlTransient
    public Set<Employer> getEmployerSet() {
        return employerSet;
    }

    public void setEmployerSet(Set<Employer> employerSet) {
        this.employerSet = employerSet;
    }

    public Role getRoleidRole() {
        return roleidRole;
    }

    public void setRoleidRole(Role roleidRole) {
        this.roleidRole = roleidRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.common.model.User[ idUser=" + idUser + " ]";
    }
    
}
