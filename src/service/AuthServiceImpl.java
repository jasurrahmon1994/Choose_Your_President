package service;

import DB.DB;
import model.User;

public class AuthServiceImpl implements AuthService{

    @Override
    public User isLogin(String phoneNumber, String password) {
        for(User user : DB.users){
            if(user.getPhoneNumber().equals(phoneNumber) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

   
    
}
