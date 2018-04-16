package FactoyPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter g for glass room\n w for wooden room\n s for steal room");
		String s=sc.nextLine();
		IRoom r;
		RoomFactory fac=new RoomFactory();
		
		r=fac.makeRoom(s);
		r.printTypeOfRoom();
		
		
		
		/*if(r==null) {
			System.out.println("try again");
		}else {
			r.printTypeOfRoom();
		}
		*/
		/*IRoom r;
		if(s.equals("w")) {
			r=new WoodenRoom();
			r.printTypeOfRoom();
		}else if(s.equals("g")) {
			r= new GlassRoom();
			r.printTypeOfRoom();
		}else if(s.equals("s")) {
			r= new StealRoom();
			r.printTypeOfRoom();
		}else {
			System.out.println("try again");
		}*/

	}

}
