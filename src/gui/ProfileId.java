/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author HOME
 */
public class ProfileId {

    public String loginName, lPass, pPass, status = "true", hintQ, hintA, email,ATM,PIN,NAME;

    public void setURF(String userId, String password) {
        loginName =userId;
        lPass = password;
    }
    public void setP(String emailId,String name){
        NAME=name;
        email=emailId;
    }
    
    public void setPass(String profilepass,String question, String answer){
        hintQ=question;
        hintA=answer;
        pPass=profilepass;
    }
    public void setAtm(String atm,String pin){
      ATM=atm;
      PIN=pin;
    }
    
}
