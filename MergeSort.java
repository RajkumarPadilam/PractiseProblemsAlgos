

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] input={2,1,4,3,2,3,2,1,2,4,6,7};
		
		new MergeSort().partition(input);
		
		for(int i:input)
			System.out.print(i);
	}
	
	public void partition(int[] input)
	{
		if(input.length<2)
			return;
		
		int mid=input.length/2;
		int[] first=new int[mid];
		
		for(int i=0;i<mid;i++)
		first[i]=input[i];
		
		int[] second=new int[input.length-mid];
		for(int i=mid;i<input.length;i++)
			second[i-mid]=input[i];
		
		partition(first);
		partition(second);
		merge(first, second, input);
	}

	public void merge(int[] first, int[] second, int[] input)
	{
		int i=0, j=0, k=0;
		
		
		while(i<first.length && j<second.length)
		{
			if(first[i]<=second[j])
			{
				input[k]=first[i];
				i++;k++;
			}
			else
			{
				input[k]=second[j];
				j++;k++;
			}
		}
		
		while(i<first.length)
		{
			input[k]=first[i];
			i++;k++;
		}
		
		while(j<second.length)
		{
			input[k]=second[j];
			j++;k++;
		}
				
	}
}

