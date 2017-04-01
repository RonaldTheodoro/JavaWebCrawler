package com.baalze.bal;

import java.security.MessageDigest;

public class Hasher {
    
    public static String toSha256(String inString) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String text = inString.toLowerCase();
        messageDigest.update(text.getBytes("ASCII"));
        byte[] hash = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder();
        
        for(byte b : hash) 
            stringBuilder.append(String.format("%02x", b));
            
        return stringBuilder.toString().toUpperCase();
    }
}
