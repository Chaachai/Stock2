/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
@Entity
public class Livraison implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Client client;
    private String AdrLivraison;
    @OneToOne
    private Commande commande;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateLivraison;
    
    
    

    public Livraison() {
        dateLivraison = new Date();
    }

    public Livraison(Long id) {
        dateLivraison = new Date();
        this.id = id;
    }

    public Livraison(String AdrLivraison) {
        dateLivraison = new Date();
        this.AdrLivraison = AdrLivraison;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        if(client==null){
            client=new Client();
        }
        return client;
        
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAdrLivraison() {
        return AdrLivraison;
    }

    public void setAdrLivraison(String AdrLivraison) {
        this.AdrLivraison = AdrLivraison;
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

    
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livraison)) {
            return false;
        }
        Livraison other = (Livraison) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livraison{" + "id=" + id + ", AdrLivraison=" + AdrLivraison + '}';
    }
    
    

}
