package jp.kenjimorita.eclipsebook;


public class Sample {
	public static void main(String[] args) {
		calc("134");
	}
	public static void calc(String str){
		int n;
		try {
			n = Integer.parseInt(str);
		} catch(Exception ex) {
			n = 0;
		}
		int total = 0;
		for(int i = 1; i<=n; i++){
			total += i;
		}
		str = Integer.toString(total);
		System.out.println("total: " + str);
	}
}

