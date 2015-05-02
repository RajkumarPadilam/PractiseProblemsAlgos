
public class test1 {

	public static void main(String[] args) {
	
		String name ="raj is great";
		test1 t= new test1();
		t.printName(name);
		
	}
	
	public void printName(String input) {
		String reverse = reverse(input);
		String result="";
		System.out.println(reverse);
		int start=0, end=0;
		reverse+=' ';
		for(;end < reverse.length();end++) {
			if(reverse.charAt(end)==' ') {
				result+=reverse(reverse.substring(start, end))+" ";
				//System.out.println(result+ " :"+result.length());
				start = end+1;
			}
		}
		System.out.println(result+" : "+result.length()+" : "+reverse.length());
		
	}
	
	public String reverse(String input) {
		char[] ar = input.toCharArray();
		int end = input.length()-1;
		int start =0;
		while(start < end) {
			char temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++; end--;
		}
		return new String(ar);	
	}
}
