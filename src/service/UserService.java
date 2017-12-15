/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;

/**
 *
 * @author Yougata
 */
public class UserService extends AbstractFacade<User> {
    
    public UserService() {
        super(User.class);
    }
    
    public int seConnecter(User user){
        User LoadedUser =find(user.getId());
        if(LoadedUser==null){
            return -1;
          
        }else if(!LoadedUser.getPassword().equals(user.getPassword())){
            return -2;
        }else 
            return 1;
            
        
        
    }
    
    public int AddUser(String id,String password){
        User user = new User();
        user.setId(id);
        user.setPassword(password);
        create(user);
        return 1;
     
    }
    
}
