/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.util.List;
import entite.Client;
public interface IClient {
        public void ajouterClient(Client C);
    public void modifierClient(Client C);
    public void supprimerClient(Client C);
    public void Authentificationcl (Client C);
    public List<Client> afficherClient();
    public Client chercherClient(Client C);
    
    
}
