/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id")
    , @NamedQuery(name = "User.findByNombre", query = "SELECT u FROM User u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "User.findByApellido", query = "SELECT u FROM User u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "User.findByCargo", query = "SELECT u FROM User u WHERE u.cargo = :cargo")
    , @NamedQuery(name = "User.findByTelefono", query = "SELECT u FROM User u WHERE u.telefono = :telefono")
    , @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username")
    , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
    , @NamedQuery(name = "User.findByRol", query = "SELECT u FROM User u WHERE u.rol = :rol")
    , @NamedQuery(name = "User.findByDireccion", query = "SELECT u FROM User u WHERE u.direccion = :direccion")
    , @NamedQuery(name = "User.findByDepartamento", query = "SELECT u FROM User u WHERE u.departamento = :departamento")    
    , @NamedQuery(name = "User.findByNacimiento", query = "SELECT u FROM User u WHERE u.nacimiento = :nacimiento")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 50)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 50)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 50)
    @Column(name = "username")
    private String username;
    @Size(max = 50)
    @Column(name = "password")
    private String password;
    @Size(max = 50)
    @Column(name = "rol")
    private String rol;
    @Size(max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 50)
    @Column(name = "departamento")
    private String departamento;
    @Size(max = 50)
    @Column(name = "nacimiento")    
    private String nacimiento;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.model.User[ id=" + id + " ]";
    }
    
}
