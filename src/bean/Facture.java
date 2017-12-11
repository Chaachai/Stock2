/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class Facture implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFacture;
    @OneToOne
    private Commande commande;
    @ManyToOne
    private Client client;
    private double TotalPrice;
    private double PrixAncient;
    private double TauxDeReduction;

    public Facture() {
        dateFacture = new Date();
    }

    public Facture(String id) {
        this.id = id;
        dateFacture = new Date();
    }

    public double getPrixAncient() {
        return PrixAncient;
    }

    public void setPrixAncient(double PrixAncient) {
        this.PrixAncient = PrixAncient;
    }

    public double getTauxDeReduction() {
        return TauxDeReduction;
    }

    public void setTauxDeReduction(double TauxDeReduction) {
        this.TauxDeReduction = TauxDeReduction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Commande getCommande() {
        if(commande==null){
            commande=new Commande();
        }
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Facture{" + "id=" + id + ", dateFacture=" + dateFacture + ", TotalPrice=" + TotalPrice + ", PrixAncient=" + PrixAncient + ", TauxDeReduction=" + TauxDeReduction + '}';
    }

    

    
    
    
    

}
