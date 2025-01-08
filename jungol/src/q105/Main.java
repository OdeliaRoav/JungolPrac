package q105;

public class Main {

	public static void main(String[] args) {
		
		String a = "          Seoul     10,312,545        +91,375";
		String b = "          Pusan      3,567,910         +5,868";
		String c = "        Incheon      2,758,296        +64,888";
		String d = "          Daegu      2,511,676        +17,230";
		String e = "        Gwangju      1,454,636        +29,774";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println();
		
		System.out.printf("%15s%15s%15s%n", "Seoul","10,312,545","+91,375");
		System.out.printf("%15s%15s%15s%n", "Pusan","3,567,910","+5,868");
		System.out.printf("%15s%15s%15s%n", "Incheon","2,758,296","+64,888");
		System.out.printf("%15s%15s%15s%n", "Daegu","2,511,676","+17,230");
		System.out.printf("%15s%15s%15s%n", "Gwangju","1,454,636","+29,774");
				
	}

}
