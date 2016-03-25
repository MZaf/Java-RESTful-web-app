/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btgrubu.leris.api.rest.poc.process.ExposeDataWithRest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zafar
 */
@Entity
@Table(name = "DOCUMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documents.findAll", query = "SELECT d FROM Documents d"),
    @NamedQuery(name = "Documents.findById", query = "SELECT d FROM Documents d WHERE d.id = :id"),
    @NamedQuery(name = "Documents.findByName", query = "SELECT d FROM Documents d WHERE d.name = :name"),
    @NamedQuery(name = "Documents.findByDocumenttype", query = "SELECT d FROM Documents d WHERE d.documenttype = :documenttype"),
    @NamedQuery(name = "Documents.findByAsdiscode", query = "SELECT d FROM Documents d WHERE d.asdiscode = :asdiscode")})
public class Documents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private Character name;
    @Column(name = "DOCUMENTTYPE")
    private Character documenttype;
    @Column(name = "ASDISCODE")
    private Integer asdiscode;

    public Documents() {
    }

    public Documents(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public Character getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(Character documenttype) {
        this.documenttype = documenttype;
    }

    public Integer getAsdiscode() {
        return asdiscode;
    }

    public void setAsdiscode(Integer asdiscode) {
        this.asdiscode = asdiscode;
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
        if (!(object instanceof Documents)) {
            return false;
        }
        Documents other = (Documents) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btgrubu.leris.api.rest.poc.process.ExposeDataWithRest.Documents[ id=" + id + " ]";
    }
    
}
