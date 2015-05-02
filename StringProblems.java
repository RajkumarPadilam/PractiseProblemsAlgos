import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class StringProblems {
	String reverse = "";
	int sum;
	
	public static void main(String[] args) {
		
		test  t =new test();
		String input= "reverse";
		//new test().reverse(input.toCharArray(), 0);
		//System.out.println(new test().reverseTwo(input));
		 //t.sortMap();
		 //System.out.println(t.printFibonaci(7));
		//t.printFibonaci2(8);
		//t.printSum(123);
		//t.StringNum("1234");
		//t.removeDupli(new int[]{1,1,2,2,2,3,4});
		t.longestPalSubstr("abcddcbaf".toCharArray());
	}
	
	public void reverse(char[] input, int i) {
		
		if(i >= input.length)
			return;
		reverse(input,i+1);
		System.out.print(input[i]);
	}
	
	public String reverseTwo(String input) {
		if(input.length() == 1)
			return input;
		else {
			System.out.println(" : "+input);
			reverse += input.charAt(input.length()-1) + reverseTwo(input.substring(0, input.length()-1));
		}
		System.out.println(" : "+input+" :"+reverse);
		return reverse;
	}

	public void sortMap() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("raj", 2);
		map.put("kumar", 4);
		map.put("hello", 1);
		
		
		Set<Map.Entry<String, Integer>> mySet = map.entrySet();
		List<Map.Entry<String, Integer>> myList= new ArrayList<>(mySet);
		Collections.sort(myList, new myComp());
		
		System.out.println(myList);
	}
	
	class myComp implements Comparator<Map.Entry<String, Integer>> {

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			return o2.getValue().compareTo(o1.getValue());
		}
		
	}

	public int printFibonaci(int num) {
			if(num == 1 || num == 2)
				return 1;
			else {
				return printFibonaci(num-1) + printFibonaci(num-2);
			}
	}
	public void printFibonaci2(int num) {
			
		int[] ar=new int[num];
		ar[0]=0;
		ar[1]=1;
		for(int i=2;i<num;i++) {
			ar[i]=ar[i-1] + ar[i-2];
			System.out.println(ar[i]);
		}
	}
	
	public int printSum(int num) {
		
		if(num ==0)
			return 0;
		sum += num%10;
		num = num/10;
		printSum(num);
		System.out.println(sum);
		return sum;
	}
	
	public void StringNum (String num) {
		
		int sum =0 ;
		for(int i=0;i<num.length();i++) {
			int n = ( num.charAt(i)- 48);
			sum =sum*10+n;
		}
		System.out.println(sum);
	}

	public void removeDuplicates(int[] input) {
		
		for(int j:input)
			System.out.print(j);
		System.out.println();
		
		int current =input[0];
		for(int i=1;i< input.length ;i++) {
			if(input[i] == current) {
				for(int k=i;k<input.length-1;k++)
					input[k]=input[k+1];
			}	//input[i] =0;
			else
			current = input[i];	
		}
		for(int j:input)
			System.out.print(j);
	}

	public void removeDupli(int[] input) {
		
		int i=0;
		int j=1;
		
		while(j < input.length) {
			
			if(input[j] == input[i]) {
				j++;
			}else {
				i++;
				input[i]=input[j];
				j++;
			}
		}
		
		j=0;
		while(j<=i)
			{System.out.print(input[j]);j++;}
		
		
	}

	int longestPalSubstr( char[] str )
	{
	    int n = str.length; // get length of input string
	 
	    // table[i][j] will be false if substring str[i..j] is not palindrome.
	    // Else table[i][j] will be true
	    boolean[][] table=new boolean[n][n];
	 
	    // All substrings of length 1 are palindromes
	    int maxLength = 1;
	    for( int i = 0; i < n; ++i )
	        table[i][i] = true;
	 
	    // check for sub-string of length 2.
	    int start = 0;
	    for( int i = 0; i < n-1; ++i )
	    {
	        if( str[i] == str[i+1] )
	        {
	            table[i][i+1] = true;
	            start = i;
	            maxLength = 2;
	        }
	    }
	 
	    // Check for lengths greater than 2. k is length of substring
	    for( int k = 3; k <= n; ++k )
	    {
	        // Fix the starting index
	        for( int i = 0; i < n - k + 1 ; ++i )
	        {
	            // Get the ending index of substring from starting index i and length k
	            int j = i + k - 1;
	 
	            // checking for sub-string from ith index to jth index iff str[i+1]
	            // to str[j-1] is a palindrome
	            if( table[i+1][j-1] && str[i] == str[j] )
	            {
	                table[i][j] = true;
	 
	                if( k > maxLength )
	                {
	                    start = i;
	                    maxLength = k;
	                }
	            }
	        }
	    }
	 
	    System.out.println("Longest palindrome substring is: ");
	    System.out.println(new String(str).substring(start, start + maxLength ));
	 
	    return maxLength; // return length of LPS
	}
}