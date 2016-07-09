package jp.tuyano.eclipsebook;

public class Computer {
	String system = "no";
	String user = "nobady";
	void installSystem(String os, String usr){
		system = os;
		user = usr;
	}
}


class PersonalComputer extends Computer {
	int cpu = 0;
	PersonalComputer(String system, String usr, int cpu){
		super();
		installSystem(system, usr, cpu);
	}
	void installSystem(String system, String usr, int cpu){
		system = system;
		user = usr;
		cpu = cpu;
	}
	void printData(){
		System.out.println("System:" + system + "\tUser Name:" + user + "\tCPU:" + cpu);
	}
}
