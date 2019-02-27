package exercisearrays;
import java.util.*;
public class exerciseremovestars {
	public static void main(String[] args) {
		ArrayList<String> b = new ArrayList<String>();
		String[] a = {"the", "quick", "brown", "fox"};
		for(int i=0; i<a.length; i++) {
			String z = a[i];
			b.add(z);
		}
		System.out.println(b);
		String g = "*";
		int r = b.size()*2;
		for (int q=1; q<=r; q+=2) {
			b.add(q,g);
		}
		System.out.println(b);
		int l = b.size()/2;
		for(int h = 1; h <=l; h++) {
			b.remove(h);
		}
		System.out.println(b);
		}
}
