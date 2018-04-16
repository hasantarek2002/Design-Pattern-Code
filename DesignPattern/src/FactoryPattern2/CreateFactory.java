package FactoryPattern2;

public class CreateFactory {
	public AbstractFactory makeRoom(String s) {

		if (s.equals("w")) {
			return new WoodenFactory();
		} else if (s.equals("g")) {
			return new GlassFactory();
		}
		/*
		 * else if(s.equals("s")) { return new StealFactory(); }
		 */
		return new StealFactory();
		// return new NullRoom();
	}

}
