package exercisearrays;
import java.util.*;
import java.util.ArrayList;

public class displaynumbers {
	public static void main(String[] args) {
		ArrayList<Double> n = new ArrayList<Double>();
		
		double[] a = {5,4,7,3,6};
		for(int i = 0; i <= 4; i++) {
			double b = a[i];
			n.add(b);
		}
		double count=0;
		for(int b = 0; b<=n.size()-1; b++) {
			
			count = count + n.get(b);
		}
		System.out.println("avg is"+count/n.size());
		int count2 = 0;
		
		for (int r = 1; r<=n.size()-1; r++) {
			if(n.get(r)>n.get(count2)) {
				count2++; 
			}
		}
		System.out.println("largest value is"+n.get(count2));
		int count3=0;
		
		for (int z = 1; z<=n.size()-1; z++) {
			if(n.get(z)<n.get(count3)) {
				count3++;
			}
			
		}
		System.out.println("smallest is "+n.get(count3));
		for(int q=0; q<=n.size(); q++) {
			if (n.get(q)%2==0.0) {
				n.remove(q);
			}
		}
		System.out.println(n.toString());
	}
	
}