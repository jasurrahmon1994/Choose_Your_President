package service;

import model.User;

public interface AuthService {
    User isLogin(String phoneNumber, String password);
}
