package jp.kenjimorita.eclipsebook;


public class Sample {
	public static void main(String[] args) {
		calc("134");
		printAll("ee", "eee");
		String[] s = {"Wellcom", "to", "Java", "world"};
		printAll(s);
		
		Integer obj = 10;
		int n = obj;//アンボクシング 
	}
	public static void printAll(String... arg){//変数引数(個数不定の引数をサポート)
		for(String s : arg){
			System.out.println(s);
		}
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

