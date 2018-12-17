package pkg1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.changeRadius(100);
		circle.transform(40, 60);
		circle.fillColor("red");
		
		System.out.println("Initial circle:");
		System.out.println();
		System.out.println(circle);
		System.out.println();
		System.out.println();
		
		ICommand iCommand=new TransformCommand(circle, 20, 30);
		ICommand iCommand2=new FillColorCommand(circle, "orange");
		ICommand iCommand3=new ChangeRadiusCommand(circle, 200);
		
		
		Invoker2 invoker2=new Invoker2();
		invoker2.setExecuteCommand(iCommand);
		invoker2.setExecuteCommand(iCommand2);
		invoker2.setExecuteCommand(iCommand3);
		
		invoker2.execute();
		
		System.out.println("After executing some command:");
		System.out.println();
		System.out.println(circle);
		System.out.println();
		System.out.println();
		
		
		invoker2.setUndoCommand(iCommand3);
		invoker2.setUndoCommand(iCommand2);
		invoker2.undo();
		
		System.out.println("After Undoing:");
		System.out.println();
		System.out.println(circle);
		System.out.println();
		System.out.println();
		
		invoker2.setRedoCommand(iCommand2);
		invoker2.setRedoCommand(iCommand3);
		invoker2.redo();
		
		System.out.println("After Redoing:");
		System.out.println();
		System.out.println(circle);
		System.out.println();
		System.out.println();
		
	
		
		
	}

}
