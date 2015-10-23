/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.controller;

import java.io.Serializable;
import java.security.MessageDigest;

/**
 *
 * @author 31240550
 */
public class SpotManager implements Serializable {
   
    private static String apiKey = "";
    private static String privateKey = "";
    private static String urlBase = "";
    
    private static String urlCharacters = "";

    
    
    
    
    public static String transform_md5(String str){
        try{
            java.security.MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; i++) {
                sb.append( Integer.toHexString( (array[i] & 0xFF | 0x100)).substring(1,3)    );
            }
            return sb.toString();
        } catch(java.security.NoSuchAlgorithmException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
