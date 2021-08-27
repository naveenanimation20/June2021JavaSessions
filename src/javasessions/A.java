package javasessions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {

	public static boolean isValid(String str) {
		boolean flag = false;
		char arr[] = str.toCharArray();

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char e : arr) {
			if (charMap.containsKey(e)) {
				charMap.put(e, charMap.get(e) + 1);
			} else {
				charMap.put(e, 1);
			}
		}

		charMap.forEach((k, v) -> System.out.println(k + "=" + v));

		for (Map.Entry<Character, Integer> e : charMap.entrySet()) {
			if (e.getValue() > 1) {
				return false;
			} else {
				flag = true;
			}
		}
		return flag;

	}

	public static void main(String[] args) {

		String str = "Raa"; //N7A14V21E28E35N28

		//System.out.println(isValid(str));
		
			if(str.length()==1) {
				System.out.println(str+7);
				return;
			}
		
		char arr[] = str.toCharArray();
		int count = 7;
		String newStr = "";
		
		for(int i=0; i<arr.length; i++) {
			newStr = newStr+arr[i]+count;
			count = count+7;
				if(count>35) {
					count = count-7*2;
					newStr = newStr+arr[i+1]+count;
					break;
				}
		}
		
		System.out.println(newStr);
		
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer ar[] = new Integer[al.size()];
		for(int i=0; i<al.size(); i++) {
			ar[i] = al.get(i);
		}
		System.out.println("middle ele: " + (ar[ar.length/2]));
		
		String t = "   This         is    my             new              java           code";
		System.out.println(t.replaceAll("\\s+", " ").trim());
		
		
		
		
	}
}
