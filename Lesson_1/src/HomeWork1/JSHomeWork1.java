package HomeWork1;

public class JSHomeWork1 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		char c = 'c';
		//String d = "strindd";
		byte e = 1;
		short f =1;
		int g = 0;
		long h = 0;
		float n;
		double j;
		int [] k = {1,23,34,5,200,3,35,45,-1};

		System.out.println("boolean a = " + a);
		System.out.println("boolean b = " + b);
		System.out.println("max values char - '/u0000' or 0 ");
		System.out.println("min values char - '/uffff' or 65536");
		System.out.println("max values String -  (-2147483648 to 2147483647)");
		System.out.println("max values byte - " + Byte.MAX_VALUE);
		System.out.println("min values byte - " + Byte.MIN_VALUE);
		System.out.println("max values Short - " + Short.MAX_VALUE);
		System.out.println("min values Short - " + Short.MIN_VALUE);
		System.out.println("max values Integer - " + Integer.MAX_VALUE);
		System.out.println("min values Integer - " + Integer.MIN_VALUE);
		System.out.println("max values Long - " + Long.MAX_VALUE);
		System.out.println("min values Long - " + Long.MIN_VALUE);
		System.out.println("max values Float - " + Float.MAX_VALUE);
		System.out.println("min values Float - " + Float.MIN_VALUE);
		System.out.println("max values Double - " + Double.MAX_VALUE);
		System.out.println("min values Double - " + Double.MIN_VALUE);
	    
		for(int i = 0; i <= k.length - 1;i++) {
			if (k[i]<g) 
				g=k[i];
			if (k[i]>h) 
				h=k[i];
		}
		System.out.println("min element in array k: " + g);
		System.out.println("max element in array k: " + h);
	}
}
