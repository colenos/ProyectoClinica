/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.pojos;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yi
 */
@Entity
@Table(name = "clinicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clinicas.findAll", query = "SELECT c FROM Clinicas c")
    , @NamedQuery(name = "Clinicas.findByCodigoClinica", query = "SELECT c FROM Clinicas c WHERE c.codigoClinica = :codigoClinica")
    , @NamedQuery(name = "Clinicas.findByNombreClinica", query = "SELECT c FROM Clinicas c WHERE c.nombreClinica = :nombreClinica")
    , @NamedQuery(name = "Clinicas.findByUbicacionClinica", query = "SELECT c FROM Clinicas c WHERE c.ubicacionClinica = :ubicacionClinica")})
public class Clinicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoClinica")
    private Integer codigoClinica;
    @Size(max = 50)
    @Column(name = "nombreClinica")
    private String nombreClinica;
    @Size(max = 50)
    @Column(name = "ubicacionClinica")
    private String ubicacionClinica;
    @OneToMany(mappedBy = "codigoClinica")
    private List<Categoria> categoriaList;
    @JoinColumn(name = "codigoCiudad", referencedColumnName = "codigoCiudad")
    @ManyToOne
    private Ciudad codigoCiudad;

    public Clinicas() {
    }

    public Clinicas(Integer codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    public Integer getCodigoClinica() {
        return codigoClinica;
    }

    public void setCodigoClinica(Integer codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getUbicacionClinica() {
        return ubicacionClinica;
    }

    public void setUbicacionClinica(String ubicacionClinica) {
        this.ubicacionClinica = ubicacionClinica;
    }

    @XmlTransient
    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public Ciudad getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(Ciudad codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoClinica != null ? codigoClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clinicas)) {
            return false;
        }
        Clinicas other = (Clinicas) object;
        if ((this.codigoClinica == null && other.codigoClinica != null) || (this.codigoClinica != null && !this.codigoClinica.equals(other.codigoClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.pojos.Clinicas[ codigoClinica=" + codigoClinica + " ]";
    }
    
}
