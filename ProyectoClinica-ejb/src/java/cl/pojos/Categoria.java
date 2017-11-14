/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yi
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByCodigoCategoria", query = "SELECT c FROM Categoria c WHERE c.codigoCategoria = :codigoCategoria")
    , @NamedQuery(name = "Categoria.findByC1", query = "SELECT c FROM Categoria c WHERE c.c1 = :c1")
    , @NamedQuery(name = "Categoria.findByC2", query = "SELECT c FROM Categoria c WHERE c.c2 = :c2")
    , @NamedQuery(name = "Categoria.findByC3", query = "SELECT c FROM Categoria c WHERE c.c3 = :c3")
    , @NamedQuery(name = "Categoria.findByC4", query = "SELECT c FROM Categoria c WHERE c.c4 = :c4")
    , @NamedQuery(name = "Categoria.findByC5", query = "SELECT c FROM Categoria c WHERE c.c5 = :c5")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoCategoria")
    private Integer codigoCategoria;
    @Column(name = "C1")
    private Integer c1;
    @Column(name = "C2")
    private Integer c2;
    @Column(name = "C3")
    private Integer c3;
    @Column(name = "C4")
    private Integer c4;
    @Column(name = "C5")
    private Integer c5;
    @JoinColumn(name = "codigoClinica", referencedColumnName = "codigoClinica")
    @ManyToOne
    private Clinicas codigoClinica;

    public Categoria() {
    }

    public Categoria(Integer codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public Integer getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(Integer codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public Integer getC1() {
        return c1;
    }

    public void setC1(Integer c1) {
        this.c1 = c1;
    }

    public Integer getC2() {
        return c2;
    }

    public void setC2(Integer c2) {
        this.c2 = c2;
    }

    public Integer getC3() {
        return c3;
    }

    public void setC3(Integer c3) {
        this.c3 = c3;
    }

    public Integer getC4() {
        return c4;
    }

    public void setC4(Integer c4) {
        this.c4 = c4;
    }

    public Integer getC5() {
        return c5;
    }

    public void setC5(Integer c5) {
        this.c5 = c5;
    }

    public Clinicas getCodigoClinica() {
        return codigoClinica;
    }

    public void setCodigoClinica(Clinicas codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCategoria != null ? codigoCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.codigoCategoria == null && other.codigoCategoria != null) || (this.codigoCategoria != null && !this.codigoCategoria.equals(other.codigoCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.pojos.Categoria[ codigoCategoria=" + codigoCategoria + " ]";
    }
    
}
