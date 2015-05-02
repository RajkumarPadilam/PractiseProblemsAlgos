
public class permu {

	public static void main(String[] args) {
		
		permu obj = new permu();
		
		obj.permutateTwo("raj","");
		/*String result = obj.permutate("rajkumar is a bad boy");
		String reverse = "";
		
		String[] my= result.split("\\s");
		for(String s : my) {
			reverse+=obj.permutate(s)+" ";
		}
		System.out.println(reverse.trim());*/
	}
	
	public String reverse(String input) {
		if(input.length()<1)
			return "";		
		String s = input.charAt(input.length()-1)+reverse(input.substring(0, input.length()-1));		
		return s;
		
	}
	
	public void permutateTwo(String first, String second) {
		
		if(first.length()<1)
		{System.out.println(second); return;}
		
		for(int i=0; i < first.length(); i++) {
			
			String fr = second+first.charAt(i);
			String we = first.substring(0, i)+first.substring(i+1, first.length());
			permutateTwo(we, fr);
		}
	}
}
