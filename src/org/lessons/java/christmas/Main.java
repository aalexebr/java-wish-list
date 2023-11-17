package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("test");
		Scanner in = new Scanner(System.in);
		
		List <String> giftArray = new ArrayList <>();
//		bonus1
		List <Gift> giftObjArray = new ArrayList <>();
//		bonus2
		Map <String,String> giftMap = new HashMap<>();
		

		while(true) {
			System.out.print("add item? y/n");
			String next = in.nextLine();
			char c = next.charAt(0);
			if(c== 'n') break;
			
			System.out.print("add new gift: ");
			String gift = in.nextLine();
			giftArray.add(gift);
			
//			bonus1
			System.out.print("for: ");
			String recepient = in.nextLine();
			
//			bonus1
			Gift g = new Gift(gift, recepient);
			giftObjArray.add(g);
			
//			bonus2 
			giftMap.put(recepient, gift);

			System.out.println("list length: "+giftArray.size());
				
			
		}
//		System.out.println(giftArray);
		in.close();
//		bonus print
//		System.out.println(giftObjArray);
//		bonus2 print
		System.out.println(giftMap);
		
		
	}

}
