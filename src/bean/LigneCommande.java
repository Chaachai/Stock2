/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class LigneCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double quantite;
    private double prixTotal;
    private double  TVA;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Commande commande;

    public LigneCommande() {
    }

    public LigneCommande(Long id) {
        this.id = id;
    }

    public LigneCommande(double quantite,double TVA) {
        
        this.quantite = quantite;
        
        this.TVA = TVA;
    }

    public double getTVA() {
        return TVA;
    }

    public void setTVA(double TVA) {
        this.TVA = TVA;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Produit getProduit() {
        if (produit == null) {
            produit = new Produit();
        }
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        if (commande == null) {
            commande = new Commande();
        }
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
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
        if (!(object instanceof LigneCommande)) {
            return false;
        }
        LigneCommande other = (LigneCommande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LigneCommande{" + "id=" + id + ", quantite=" + quantite + ", prixTotal=" + prixTotal + ", TVA=" + TVA + '}';
    }

    

}
