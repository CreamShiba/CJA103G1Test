package com.carshop.coupon;

import java.util.Scanner;

public class CouponVer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入身分證字號");
		
		String coupon = sc.next();
		//[A-Za-z]大小寫皆可
		String coupon_no = "^[A-Z][1-2]\\d{8}$";
		
		if(coupon.matches(coupon_no)) {
			System.out.println("輸入成功");
		}else {
			System.out.println("輸入錯誤!");
		}
	}
}
