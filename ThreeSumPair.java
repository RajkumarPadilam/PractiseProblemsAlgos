import java.util.Arrays;


public class ThreeSumPair {

	public static void main(String[] args) {
		
		int[] input = {3,2,1,2,2,1,4,5,6,7,4,5};
		Arrays.sort(input);
		
		findSum(input, 6);
		
		
	}
	
	public static void findSum(int[] input, int sum) {
		int len = input.length;
		int end =len-1 ;
		int start =0;
	
		for( int i=0;i<len-2;i++) {
		
			end =len-1;
			start = i+1;
			while(start < end) {
				if((input[start]+input[i]+input[end]) == sum)
					{System.out.println(input[start]+" : "+ input[i]+" : "+input[end]);start++;end--; }
				else if( (input[start]+input[i]+input[end])<sum )
					start++;
				else
					end--;
			}
		}
	}
}
