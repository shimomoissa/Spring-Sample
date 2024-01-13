package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegisterBean {
	
	private String name;
	private int age;
	

	 public String getAdultMessage() {
	        if (age >= 20) {
	            return "成人";
	        } else {
	            return "未成年";
	        }
	    }
	 
	 public String getSpecialMessage() {
	        if (age % 2 == 0) {
	            return name + "さん、偶数歳ですね。特別なメッセージをお伝えします。";
	        } else {
	            return "特別なメッセージはありません。";
	        }
	    } 
}