/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;
import bean.LigneCommande;
import bean.Produit;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class LigneCommandeService extends AbstractFacade<LigneCommande> {

     CommandeService commandeService = new CommandeService();
      ProduitService produitService = new ProduitService();
      
    public LigneCommandeService() {
        super(LigneCommande.class);
    }
  
    
    public void initDB() {
        AjoutLigneCommande("CMD01","P01",50,0.2);
        AjoutLigneCommande("CMD01","P03",50,0.2);
        
        
        
    }
    
  public int AjoutLigneCommande(String idCommande,String idProduit,double qté,double tva){
      Commande c =commandeService.find(idCommande);
      Produit p = produitService.find(idProduit);
      double pt=0;
      if(c != null && p != null){
          LigneCommande lc = new LigneCommande();
          lc.setTVA(tva);
          lc.setQuantite(qté);
          lc.setCommande(c);
          lc.setProduit(p);
          pt=p.getPrixUnitaire()*qté*(1+tva);
          lc.setPrixTotal(pt);
          create(lc);
          return 1;
    
      }else
     return -1;
      
  }
    
    
    
    
    
    
}
