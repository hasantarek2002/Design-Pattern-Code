package FactoryPattern2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter g for glass room\n w for wooden room\n s for steal room");
		String s=sc.nextLine();
		CreateFactory r=new CreateFactory();
		AbstractFactory fac=r.makeRoom(s);
		
		
		IDoor d=fac.createDoor();
		IRoom R=fac.createRoom();
		IWindow w=fac.createWindow();
		
		d.printTypeOfDoor();
		R.printTypeOfRoom();
		w.printTypeOfWindow();
		
		
		

	}

}
