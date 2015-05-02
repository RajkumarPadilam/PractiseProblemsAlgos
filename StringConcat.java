
public class StringConcat {

	public static void main(String[] args) {
		
		String input = "aaaccdddeeeef" ; 
		StringConcat in = new StringConcat();
		in.concat(input);
	}
	
	public void concat(String input) {
		
		StringBuilder sb = new StringBuilder();
		char start = input.charAt(0);
		int count=1;
		for(int i=1;i<input.length();i++) {
			
			if(input.charAt(i)==start) {
				count ++ ;
			} else {
				sb.append(start).append(count);
				start = input.charAt(i);
				count=1;
			}	
		}
		sb.append(input.charAt(input.length()-1)).append(count);
		
		System.out.println(sb);
	}
}
