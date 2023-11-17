import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("test");
		Scanner in = new Scanner(System.in);
		
		List <String> giftArray = new ArrayList <>();
		
		while(true) {
			System.out.print("add item? y/n");
			String next = in.nextLine();
			char c = next.charAt(0);
			if(c== 'n') break;
			
			System.out.print("add new item: ");
			String gift = in.nextLine();
			
			giftArray.add(gift);
			giftArray.size();
			System.out.println("list length: "+giftArray.size());
				
			
		}
		System.out.println(giftArray);
		in.close();
	}

}
