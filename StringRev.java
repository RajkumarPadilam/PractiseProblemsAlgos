import java.util.Arrays;


public class StringRev {

	public static void main(String[] args) {
		
		String input="raj";
		//System.out.println(input.substring(input.length()-1,input.length()));
		StringRev re=new StringRev();
		//System.out.println(re.StringRev(input));
		//re.checkUnique();
		String s1="r j k";
		re.replaceSpaces(s1.toCharArray(), s1.length());
	}
	
	public String StringRev(String input) {
		System.out.println(input);
		if(input.length()<1)
			return "";
		input = input.substring(input.length()-1,input.length()) + StringRev(input.substring(0,input.length()-1));
		return input;
	}
	
	public void checkUnique() {
		
		String s1 = "qweqweqwe";
		String s2 = "qweqweqwea";
		int[] myArray = new int[256];
		for( int i : myArray) {
			if(i!=0)
				System.out.print('q'+i);
		}
		
		for(int i=0;i<s1.length();i++) {
			myArray[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++) {
			myArray[s2.charAt(i)]--;
		}
		
		for( int i : myArray) {
			if(i!=0)
				System.out.print(i);
		}
	}

	public void replaceSpaces(char[] str, int length) {
		int spaces=0;
	
		for( int i=0;i <length ; i++) {
			if(str[i]==' ')
			spaces++;
		}
		int newLength = length + spaces *2;
		str = Arrays.copyOf(str, newLength);
		
		for(int j=length-1;j>0;j--) {
			if(str[j]==' ') {
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength-=3;
			}
			else {
				str[newLength-1] = str[j];
				newLength--;
			}
		}
		System.out.println(new String(str));
	}
	
	public void concat() {
		String my = "aaabbcccaaa";
		char[] me=my.toCharArray();
		int start=0;
		int end=0;
		
	}

}
