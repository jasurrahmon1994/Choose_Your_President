import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import DB.DB;
import model.User;
import model.Vote;
import service.AuthServiceImpl;
import service.UserServiceImpl;
import service.VoteServiceImpl;
import utils.CommonUtils;

public class App {
    private static Integer i;
    public static void main(String[] args) {
        System.out.println("Hello, " + (char)('A' + 1));
        System.out.println("Hello, " + ('A' + 1));
        System.out.println("Hello, " + 'A' + 1);
       
        // System.out.println("Welcome to NoMatterYourVote App!");
        // DataLoader.run();
        // outer: while (true) {
        //     String result = CommonUtils.scannerString("Choose menu: 1. Login 2. Stop");
        //     AuthServiceImpl authServiceImpl = new AuthServiceImpl();
        //     switch (result) {
        //         case "1":
        //             String phoneNumber = CommonUtils.scannerString("Enter phone number: ");
        //             String password = CommonUtils.scannerString("Enter password: ");
        //             User user = authServiceImpl.isLogin(phoneNumber, password);
        //             if(user != null){
        //                 showUserMenu(phoneNumber);
        //             } else {
        //                 System.out.println("There is not such a user!!!");
        //             }
        //             break;
        //         case "2":
        //             System.out.println("Thank yor for your time");
        //             break outer;
        //         default:
        //             System.out.println("Error command");
        //     }
        // }

    }

    private void print() {
        long a = 24;
        System.out.println(a);
    }

    private static void showUserMenu(String phoneNumber) {
        System.out.println("Choose one of the following menus: ");
        
        outer: while (true) {
            
            UserServiceImpl userServiceImpl = new UserServiceImpl();
            VoteServiceImpl voteServiceImpl = new VoteServiceImpl();
            String result = CommonUtils.scannerString("1. Candidates info 2. Vote 3. Logout");
            switch (result) {
                case "1":
                    String candidateList = new UserServiceImpl().getCandidates(DB.candidates);
                    String candidateId = CommonUtils.scannerString(candidateList);
                    userServiceImpl.showCandidateInfo(Integer.parseInt(candidateId));
                    break;
                case "2":
                    voteServiceImpl.vote(phoneNumber);
                    break;
                case "3":
                    System.out.println("You are logged out");
                    break outer;
                default:
                    System.out.println("Error command");
            }
        }
    }
}
