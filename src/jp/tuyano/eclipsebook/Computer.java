package jp.tuyano.eclipsebook;

public class Computer {
	String system = "no";
	String user = "nobady";
	void installSystem(String os, String usr){
		system = os;
		user = usr;
	}
	void printData (){
		System.out.println("System:" + system + "\tUser Name:" + user);
	}

}


class PersonalComputer extends Computer {
	int cpu = 0;
	void installSystem(String os, String usr){
		system = os;
		user = usr;
		cpu = 16;
	}
	void installSystem(String os, String usr, int c) {
		system = os;
		user = usr;
		cpu = c;
	}
	
	void printData(){
		System.out.println("System:" + system + "\tUser Name:" + user + "\tCPU:" + cpu);
	}
}
