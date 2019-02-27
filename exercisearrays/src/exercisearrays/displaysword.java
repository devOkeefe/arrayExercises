package exercisearrays;
import java.util.*;
import java.util.ArrayList;
public class displaysword {
	public static void main(String [] args) throws Exception{
		ArrayList<String> words = new ArrayList<String>();
		
		String[] a = {"DEVIN", "CARLA", "JIMMIEs", "ANDY"}; 
		for (int i=0; i<=3; i++) {
			String word = a[i];
			words.add(word);
		}
		System.out.println(words);
		
		
			
			
			for(int b=0; b<=3; b++) {
				String F = words.get(b);
				
				int x = F.length();
				String q = F.substring(x-1, x);
				String L = "s";
				String f = "S";
				if (q.equals(L)) {
				F = F.substring(0, x-1)+f;
				words.remove(b);
				words.add(b, F);
				
				
				
				}
				
			}
			
			System.out.println(words);
			int count2= 0;
			for(int z = 0; z<=3; z++) {
				
				int B = z;
				if (z!=count2) {
					B = count2;
				}
				String k = words.get(B);
				int w = k.length();
				String c = k.substring(w-1, w);
				String j = "S";
				if(c.equals(j)) {
					words.remove(B);
					count2--;
				}
				count2++;
			}
			
	System.out.println();
	System.out.println(words);
}
	
}
