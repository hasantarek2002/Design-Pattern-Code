package flyWeightDesignPattern;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random ran = new Random();

		String color[] = { "Red", "Green", "Blue" };
		Circle[] c = new Circle[100000];
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			int x = ran.nextInt(100);
			int y = ran.nextInt(100);
			int r = ran.nextInt(100);
			int col = ran.nextInt(3);
			String s = color[col];
			c[i] = new Circle(x, y, r, s);
			c[i].print();

		}
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);

	}

}
