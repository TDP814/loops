public class loops {

	public static void main(String[] args) {
		
		String s ="My String";
		int length = findLength(s);
		System.out.println(length);

		// int x = 1; //start
		// while(x <= 100){
		// 	System.out.println(x);
		// 	x++;
		// }

		// for (int i=1; i <= 100; i++) {
		// 	System.out.println(i);
		// }

		// int z = 45;

		// while (z >= 20) {
		// 	System.out.println(z);
		// 	z-=5;
		// }

		// System.out.println();

		// for (int i = 24; i<= 68; i+=2) {
		// 	System.out.println(i);
		// }

	}

	//return the length of str. assume no length method built in to String
	public static int findLength(String str){
		int len = 0;
		for (int i=0; i<str.length; i++) {
			len++;
		}

		return len;

	}
	
}