package com.test;

public class Main {
public static void main(String[] args) {
	String[] imgUrls = new String[5];
	String imgUrl = "/images/t/t4/e1.jpg,/images/t/t4/e2.jpg,/images/t/t4/e3.jpg,/images/t/t4/e4.jpg,/images/t/t4/e5.jpg";
	for(int i=0;i<5;i++){
		imgUrls[i] = imgUrl.split(",")[i];
		System.out.println(imgUrl.split(",")[i]);
	}
}
}
