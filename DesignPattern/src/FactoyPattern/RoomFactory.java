package FactoyPattern;

public class RoomFactory {
	
	public IRoom makeRoom(String s) {
		
		if(s.equals("w")) {
			return new WoodenRoom();
		}else if(s.equals("g")) {
			return new GlassRoom();
		}else if(s.equals("s")) {
			return new StealRoom();
		}
		return new NullRoom();
	}

}
