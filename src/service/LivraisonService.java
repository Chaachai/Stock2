/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.Livraison;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class LivraisonService extends AbstractFacade<Livraison> {
      CommandeService commandeService = new CommandeService();
      ClientService clientService = new ClientService();
      
    public LivraisonService() {
        super(Livraison.class);
    }
    
    public int AjoutLivraison(String idCommande, String adrlivraison,String idClient){
        Commande cd =commandeService.find(idCommande);
        Client cl = clientService.find(idClient);
        if(cd!= null && cl!= null){
            Livraison lv = new Livraison(adrlivraison);
            lv.setClient(cl);
            lv.setCommande(cd);
            create(lv);
            return 1;
            
            
            
        }else
            return -2;
        
        
    }
    
    

}
