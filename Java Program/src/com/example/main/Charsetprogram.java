package com.example.main;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class Charsetprogram {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		/*
		 *  byte[] postedBytes = new byte[len]; String postedBody = new
		 * String(postedBytes, 0, len, "8859_1"); System.out.println(postedBody);
		 */
		int len = 6000;
		  if(len <= 0) {
	            //return new HashMap<>();
	        }  else {
	            byte[] postedBytes = new byte[len];
	            try {
	                int offset = 0;

	                do {
	                    int inputLen = 6000;//in.read(postedBytes, offset, len - offset);
	                    if(inputLen <= 0) {
	                        throw new IllegalArgumentException();
	                    }

	                    offset += inputLen;
	                } while(len - offset > 0);
	            } catch (Exception var7) {
	                throw new IllegalArgumentException(var7.getMessage());
	            }
	            try {
	                String postedBody = new String(postedBytes, 0, len, "8859_1");
	                System.out.println(postedBody);
	               // return parseRawQueryString(postedBody);
	            } catch (UnsupportedEncodingException e) {
	                throw new IllegalArgumentException(e.getMessage());
	            }
	        }
	}
	
	
	
}
