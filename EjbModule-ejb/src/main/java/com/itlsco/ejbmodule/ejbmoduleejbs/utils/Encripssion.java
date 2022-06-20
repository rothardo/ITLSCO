/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itlsco.organization.organizationejbs.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Encripssion {

    public static String encodePassword_SHA256_Base64(String pwd) {
        String encoded = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(pwd.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            encoded = Base64.getEncoder().encodeToString(digest);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(Encripssion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Base64.getEncoder().
        return encoded;
    }

    public static void main(String[] args) {
//        String[] passwords = new String[]{"abc", "pass@123"};
        String[] passwords = new String[]{"Admin@123", "editor2@123", "editor3@123"};
        if (args.length > 0) {
            passwords = args;
        }
        for (String pass : passwords) {
//            System.out.println("Password = " + pass);
//            System.out.println("Encoded = " + encodePassword_SHA256_Base64(pass));

            System.out.print(pass);
            System.out.println("\t" + encodePassword_SHA256_Base64(pass));
        }
    }
}














//Username:admin@simgile.wiki 
//Password:Admin@wiki