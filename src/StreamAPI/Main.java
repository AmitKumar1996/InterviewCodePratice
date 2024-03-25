package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(1);
		
		arr.add(2);
		arr.add(10);
		arr.add(4);
		arr.add(5);
		 int max=0;
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i)>max) {
				max=arr.get(i);
			}
		}
		System.out.println(max);
		
		
		

	}

}
