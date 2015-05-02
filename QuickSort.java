import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] input={2,6,9,1,5,4};
		
		int typeOfPivot = 2;
		
		new QuickSort().sort(typeOfPivot,0, 5, input);
		
		for(int i:input)
			System.out.print(i);
	}
	
	public void sort(int typeOfPivot, int start, int end , int[] input)
	{
		if(start < end)
		{
			int pivot=partition(typeOfPivot,start, end, input);
			
			sort(typeOfPivot,start, pivot-1, input);
			sort(typeOfPivot,pivot+1,end,input);
		}
	}
	
	public int partition(int typeOfPivot, int start, int end,int[] input)
	{
		if(typeOfPivot==0)
		{
			int random=new Random().nextInt((end-start)+1)+start;
			swapElements(end, random, input);
		}
		else if(typeOfPivot==1)
		{
			swapElements(end, start, input);
		}
		else
		{
			int random1=new Random().nextInt((end-start)+1)+start;
			int random2=new Random().nextInt((end-start)+1)+start;
			int random3=new Random().nextInt((end-start)+1)+start;
			int random = start+0;
			if(random1>=random2)
			{
				if(random2>=random3)
					random=random2;
				else
				if(random3>=random1)
					random=random1;
			}else
			{
				if(random1>=random3)
					random=random1;
				else if(random3>=random2)
					random=random2;
			}
			swapElements(end, random, input);
			
		}
		
		int pivot=input[end];		
		
		int startIndex=start;
		for(int i=start;i<end;i++)
		{
			if(input[i]<pivot)
			{
				int temp=input[i];
				input[i]=input[startIndex];
				input[startIndex]=temp;
				
				startIndex++;
			}
		}
		swapElements(startIndex, end, input);
		return startIndex;
	}
	
	public void swapElements(int index1, int index2, int[] input)
	{
		int temp=input[index1];
		input[index1]=input[index2];
		input[index2]=temp;
	}
}

