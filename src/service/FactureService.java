/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import bean.Commande;
import bean.Facture;
import bean.LigneCommande;
import java.util.List;

/**
 *
 * @author CHAACHAI Youssef <youssef.chaachai@gmail.com>
 */
public class FactureService extends AbstractFacade<Facture> {

    ClientService clientService = new ClientService();
    CommandeService commandeService = new CommandeService();

    public FactureService() {
        super(Facture.class);
    }

    public int AjoutFacture(String idFacture, String idCommande, String idClient) {
        Client cl = clientService.find(idClient);
        Commande cm = commandeService.find(idCommande);
        double total = 0;
        double nvtotal=0;
        if (cl != null && cm != null) {
           Facture fc = new Facture(idFacture);
           fc.setClient(cl);
           fc.setCommande(cm);
           total=calculTotalCommande(idCommande);
           fc.setPrixAncient(total);
           if(cl.getClasse().getClasse()=='A'){
               nvtotal=total-(total*0.5);
               fc.setTauxDeReduction(0.5);
        
           }else if(cl.getClasse().getClasse()=='B'){
            nvtotal=total-(total*0.25);
            fc.setTauxDeReduction(0.25);
           }else if(cl.getClasse().getClasse()=='C'){
            nvtotal=total-(total*0.1);
            fc.setTauxDeReduction(0.1);
           }else if(cl.getClasse().getClasse()=='D'){
              nvtotal=total; 
              fc.setTauxDeReduction(0);
           }else{
               return -3;
           }
           fc.setTotalPrice(nvtotal);
            create(fc);
            return 1;
        }else
            return -2;
        
              
    }
    
    public double calculTotalCommande(String idCommande){
        Commande cm = commandeService.find(idCommande);
        List<LigneCommande> lc= cm.getLigneCommandes();
        double tt=0;
        for (int i = 0; i < lc.size(); i++) {
            LigneCommande l = lc.get(i);
            tt+=l.getPrixTotal();   
            
        }
        
        return tt;
    }
    

}
