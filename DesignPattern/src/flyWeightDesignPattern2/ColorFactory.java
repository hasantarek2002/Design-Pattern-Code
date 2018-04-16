package flyWeightDesignPattern2;

import java.util.HashMap;

public class ColorFactory {
	public HashMap<String, FlyWeightCircle> map=new HashMap<String, FlyWeightCircle>();
	
	public FlyWeightCircle createCircle(String color) {
		if(map.get(color) ==null) {
			System.out.println("first time for "+color+" color");
			map.put(color, new FlyWeightCircle(color));
			return new FlyWeightCircle(color);
		}
		return map.get(color);
		
	}
	
	

}
