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
import javax.persistence.Lob;
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
 * @author zafar
 */
@Entity
@Table(name = "TERRITORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Territory.findAll", query = "SELECT t FROM Territory t"),
    @NamedQuery(name = "Territory.findById", query = "SELECT t FROM Territory t WHERE t.id = :id"),
    @NamedQuery(name = "Territory.findBySystemstartdate", query = "SELECT t FROM Territory t WHERE t.systemstartdate = :systemstartdate"),
    @NamedQuery(name = "Territory.findBySystemenddate", query = "SELECT t FROM Territory t WHERE t.systemenddate = :systemenddate"),
    @NamedQuery(name = "Territory.findByUrisid", query = "SELECT t FROM Territory t WHERE t.urisid = :urisid"),
    @NamedQuery(name = "Territory.findByType", query = "SELECT t FROM Territory t WHERE t.type = :type"),
    @NamedQuery(name = "Territory.findByParentid", query = "SELECT t FROM Territory t WHERE t.parentid = :parentid"),
    @NamedQuery(name = "Territory.findByTerritorylevel", query = "SELECT t FROM Territory t WHERE t.territorylevel = :territorylevel"),
    @NamedQuery(name = "Territory.findByPolygon", query = "SELECT t FROM Territory t WHERE t.polygon = :polygon")})
public class Territory implements Serializable {

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
    @Column(name = "URISID")
    private Integer urisid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TYPE")
    private int type;
    @Lob
    @Size(max = 32700)
    @Column(name = "NAME")
    private String name;
    @Column(name = "PARENTID")
    private Integer parentid;
    @Column(name = "TERRITORYLEVEL")
    private Integer territorylevel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POLYGON")
    private Double polygon;
    @Lob
    @Size(max = 32700)
    @Column(name = "OBSERVATIONS")
    private String observations;

    public Territory() {
    }

    public Territory(Integer id) {
        this.id = id;
    }

    public Territory(Integer id, int type) {
        this.id = id;
        this.type = type;
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

    public Integer getUrisid() {
        return urisid;
    }

    public void setUrisid(Integer urisid) {
        this.urisid = urisid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getTerritorylevel() {
        return territorylevel;
    }

    public void setTerritorylevel(Integer territorylevel) {
        this.territorylevel = territorylevel;
    }

    public Double getPolygon() {
        return polygon;
    }

    public void setPolygon(Double polygon) {
        this.polygon = polygon;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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
        if (!(object instanceof Territory)) {
            return false;
        }
        Territory other = (Territory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btgrubu.leris.api.rest.poc.process.ExposeDataWithRest.Territory[ id=" + id + " ]";
    }
    
}
