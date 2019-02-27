package exercisearrays;
import java.util.*;
import java.util.ArrayList;
public class arraylistmystery {
	public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 1; i <= 10; i++) {
	list.add(10 * i);   // [10, 20, 30, 40, ..., 100]
	}
//int count=0;
for (int i = 0; i < list.size(); i++) {
	list.remove(i);
	//by removing the list at i the list its self shrinks so it removes every other Integer fix this by adding 
	}
System.out.println(list);
}
}
