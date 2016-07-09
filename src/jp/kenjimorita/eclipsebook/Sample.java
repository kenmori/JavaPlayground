package jp.kenjimorita.eclipsebook;


public class Sample {

	public static void main(String[] args) {
		PersonalComputer pc1 = new PersonalComputer("XP", "toro", 32);
		PersonalComputer pc2 = new PersonalComputer("XP", "toro", 32);
		if(pc1.equals(pc2)){
			System.out.println("System is equel");
		} else {
			System.out.println("System is not equel");
		}
	}
}

