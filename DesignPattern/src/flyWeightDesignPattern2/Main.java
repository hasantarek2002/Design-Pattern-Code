package flyWeightDesignPattern2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random ran = new Random();
		ColorFactory f=new ColorFactory();

		String color[] = { "Red", "Green", "Blue" };
		FlyWeightCircle[] c = new FlyWeightCircle[100000];
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			/*int x = ran.nextInt(100);
			int y = ran.nextInt(100);
			int r = ran.nextInt(100);*/
			int col = ran.nextInt(3);
			String s = color[col];
			c[i]=f.createCircle(s);
			
		}
		
		for (int i = 0; i < 100000; i++) {
			int x = ran.nextInt(100);
			int y = ran.nextInt(100);
			int r = ran.nextInt(100);
			//c[i].draw(x, y, r);
			
		}
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);

	}

}
