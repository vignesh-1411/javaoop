package comparee;

import java.util.Arrays;
import java.util.Scanner;

public class ShoeDriver {
	public static void main(String[] args) {
		Shoe s1=new Shoe();
		s1.setBrand("nike");
		s1.setPrice(9000);
		s1.setSize(10);
		s1.setType("whitesneakers");
		
		Shoe s2=new Shoe("adidas",800,10,"sports");
		
		Shoe s3=new Shoe("bata",1000,9,"formal");
		
		Shoe s4=new Shoe("puma",900,8,"casual");
		
		Shoe s5=new Shoe();
		s5.setBrand("nike");
		s5.setPrice(1000);
		s5.setSize(9);
		s5.setType("sneakers");
		
		Shoe s6=new Shoe();
		s6.setBrand("nike");
		s6.setPrice(5000);
		s6.setSize(8);
		s6.setType("casual");
		
		Shoe s7=new Shoe("adidas",900,11,"running");
		Shoe s8=new Shoe("bata",1200,10,"formal");
		Shoe s9=new Shoe("puma",9000,9,"leather");
		Shoe s10=new Shoe("puma",7000,10,"sports");
		
		Shoe[] shoes= {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		
//		Arrays.sort(shoes);
		System.out.println("These are the available SHOES.....");
		for (Shoe shoe : shoes) {
			
			System.out.println("--------------------------");
			System.out.println("BRAND: "+shoe.getBrand());
			System.out.println("PRICE: "+shoe.getPrice());;
			System.out.println("SIZE: "+shoe.getSize());
			System.out.println("TYPE: "+shoe.getType());
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("IF YOU WANT TO SORT BY BRAND PRESS 1: ");
//		System.out.println("IF YOU WANT TO SORT BY PRICE PRESS 2: ");
//		System.out.println("IF YOU WANT TO SORT BY SIZE PRESS 3: ");
//		System.out.println("IF YOU WANT TO SORT BY TYPE PRESS 4: ");
		int in=scan.nextInt();
		switch(in) {
		case 1:
			System.out.println("PRESS 1 FOR NIKE");
			System.out.println("PRESS 2 FOR ADIDAS");
			System.out.println("PRESS 3 FOR BATA");
			System.out.println("PRESS 4 FOR PUMA");
			int brand=scan.nextInt();
			switch(brand) {
			case 1:
				for (Shoe shoe : shoes) {
					if(shoe.getBrand().contains("nike")) {
						System.out.println("--------------------------");
						System.out.println("BRAND: "+shoe.getBrand());
						System.out.println("PRICE: "+shoe.getPrice());;
						System.out.println("SIZE: "+shoe.getSize());
						System.out.println("TYPE: "+shoe.getType());
						
					}
				}
				System.out.println("IF YOU WANT TO SORT BY PRICE PRESS 1: ");
				System.out.println("IF YOU WANT TO SORT BY SIZE PRESS 2: ");
				System.out.println("IF YOU WANT TO SORT BY TYPE PRESS 3: ");
				int n=scan.nextInt();
				switch(n) {
				case 1:
					ShoePriceComparator spc=ShoePriceComparator.getshoePriceComparator();
					Arrays.sort(shoes,spc);
					for (Shoe shoe : shoes) {
						if(shoe.getBrand().contains("nike")) {
							System.out.println("--------------------------");
							System.out.println("BRAND: "+shoe.getBrand());
							System.out.println("PRICE: "+shoe.getPrice());;
							System.out.println("SIZE: "+shoe.getSize());
							System.out.println("TYPE: "+shoe.getType());
							
						}
					}
					break;
				case 2:
					ShoeSizeComparator ssc=ShoeSizeComparator.getShoeSizeComparator();
					Arrays.sort(shoes,ssc);
					for (Shoe shoe : shoes) {
						if(shoe.getBrand().contains("nike")) {
							System.out.println("--------------------------");
							System.out.println("BRAND: "+shoe.getBrand());
							System.out.println("PRICE: "+shoe.getPrice());;
							System.out.println("SIZE: "+shoe.getSize());
							System.out.println("TYPE: "+shoe.getType());
							
						}
					}
					break;
				case 3:
					ShoeTypeComparator stc=ShoeTypeComparator.getShoeTypeComparator();
					Arrays.sort(shoes,stc);
					for (Shoe shoe : shoes) {
						if(shoe.getBrand().contains("nike")) {
							System.out.println("--------------------------");
							System.out.println("BRAND: "+shoe.getBrand());
							System.out.println("PRICE: "+shoe.getPrice());;
							System.out.println("SIZE: "+shoe.getSize());
							System.out.println("TYPE: "+shoe.getType());
							
						}
					}
					break;
				default:
					System.out.println("enter valid number...");
					break;
						
					
					
				}
				
			}
			
		}

//		
//		System.out.println("sorting wrt pricee:\n");
//		
//		Arrays.sort(shoes, spc);
//		
//		for (Shoe shoe : shoes) {
//			System.out.println(shoe.getBrand());
//			System.out.println(shoe.getPrice());;
//			System.out.println(shoe.getSize()+" "+shoe.getType());
//		}
	}

}
