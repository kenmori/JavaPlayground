package jp.kenjimorita.eclipsebook;

public class Computer {
	String system = "no";
	String user = "nobady";
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((system == null) ? 0 : system.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (system == null) {
			if (other.system != null)
				return false;
		} else if (!system.equals(other.system))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	void installSystem(String os, String usr){
		system = os;
		user = usr;
	}
}


class PersonalComputer extends Computer {
	int cpu = 0;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpu;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalComputer other = (PersonalComputer) obj;
		if (cpu != other.cpu)
			return false;
		return super.equals(obj);
	}
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
