package com.sureson.controllers;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;


public class Password_hash {
	/*password hash source from https://www.owasp.org/index.php/Hashing_Java*/
	public static String hashPassword(String user_input_password ) {
		final char[] password = { ' ', ' ','b' };
		final byte[] salt = user_input_password.getBytes();
		final int iterations =10;
		final int keyLength=10;
		String hash_Result;
	       try {
	           SecretKeyFactory skf = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA512" );
	           PBEKeySpec spec = new PBEKeySpec( password, salt, iterations, keyLength );
	           SecretKey key = skf.generateSecret( spec );
	           byte[] res = key.getEncoded( );
	           hash_Result=""+res[0]+"";
	           System.out.println("hash_Result is : "+hash_Result);
	           return hash_Result;
	 
	       } catch( NoSuchAlgorithmException | InvalidKeySpecException e ) {
	           throw new RuntimeException( e );
	       }
	   }
}
