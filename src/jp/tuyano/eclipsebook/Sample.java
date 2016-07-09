package jp.tuyano.eclipsebook;


public class Sample {

	public static void main(String[] args) {
		PersonalComputer pc = new PersonalComputer();
		pc.installSystem("Windows8", "Kenji", 64);
		pc.printData();
	}
}

