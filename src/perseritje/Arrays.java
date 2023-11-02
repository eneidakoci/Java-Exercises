package perseritje;

public class Arrays {

	public static void main(String[] args) {
		char[] a= {'A', 'B', 'C', 'D', 'E', 'F'};
		int i=a.length-2;
		while(i>=0) {
			System.out.print(a[i]);
			i=i-2;
		}
	}

}
