/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btgrubu.leris.api.rest.poc.process.ExposeDataWithRest;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zafar
 */
@Entity
@Table(name = "PLAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plan.findAll", query = "SELECT p FROM Plan p"),
    @NamedQuery(name = "Plan.findById", query = "SELECT p FROM Plan p WHERE p.id = :id"),
    @NamedQuery(name = "Plan.findBySystemstartdate", query = "SELECT p FROM Plan p WHERE p.systemstartdate = :systemstartdate"),
    @NamedQuery(name = "Plan.findBySystemenddate", query = "SELECT p FROM Plan p WHERE p.systemenddate = :systemenddate")})
public class Plan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SYSTEMSTARTDATE")
    @Temporal(TemporalType.DATE)
    private Date systemstartdate;
    @Column(name = "SYSTEMENDDATE")
    @Temporal(TemporalType.DATE)
    private Date systemenddate;

    public Plan() {
    }

    public Plan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getSystemstartdate() {
        return systemstartdate;
    }

    public void setSystemstartdate(Date systemstartdate) {
        this.systemstartdate = systemstartdate;
    }

    public Date getSystemenddate() {
        return systemenddate;
    }

    public void setSystemenddate(Date systemenddate) {
        this.systemenddate = systemenddate;
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
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btgrubu.leris.api.rest.poc.process.ExposeDataWithRest.Plan[ id=" + id + " ]";
    }
    
}
