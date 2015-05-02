import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HeapSort {
	
	static int[] num;
	static int left;
	static int right;
	static int heapsize;
	static int largest;
	private static Scanner input;
	
	
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		System.out.println("array size");
		int n=input.nextInt();
		ArrayList<Integer> inputArray= new ArrayList<Integer>(n);
		
		int num[] = new int[n];
		System.out.println("Enter the array elements"); 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("filename"));
			String input = br.readLine();
			while(input!=null)
			{
				inputArray.add(Integer.parseInt(input));
				input=br.readLine();
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*for(int i = 0;i<num.length;i++){
			inputArray.add(i, input.nextInt());
		//num[i] = input.nextInt();
		}*/
	
		//int[] num= {1,3,2,5};
		Heapsort(inputArray);
		for(int i = 0;i<num.length;i++){
        System.out.println(inputArray.get(i));
	}
	
	}

	private static void Build_Maxheap(ArrayList<Integer> num) {
	
		// TODO Auto-generated method stub
		heapsize=num.size()-1;
		for(int i=heapsize/2;i>=0;i--)
		{
			Max_Heapify(num,i);
		}
		
		
	}

	private static void Heapsort(ArrayList<Integer> num) {
		
		 Build_Maxheap(num);
		
		// TODO Auto-generated method stub
		for(int i = heapsize;i>0;i--){
			int temp=num.get(0);
			num.set(0, num.get(i));
			num.set(i, temp);
		
		heapsize=heapsize-1;
		Max_Heapify(num,0);
		}
	}

	private static void Max_Heapify(ArrayList<Integer> num, int i) {
		int l,r;
	
		// TODO Auto-generated method stub
		l=left(i);
		r=right(i);
		if (l<=heapsize&& num.get(l)>num.get(i)){
				largest = l;
		}
		else {
			largest = i;
		}
		if (r<=heapsize && num.get(r)>num.get(largest))
		{
				largest=r;
		}
				if (largest!=i)
				{
					int temp=num.get(i);
					num.set(i, num.get(largest));
					num.set(largest, temp);
					
					Max_Heapify(num,largest);
		
	}
	}

	private static int left(int i) {
		return left = 2*i;
	}

	private static int right(int i) {
		return right = 2*i+1;
	}

	
	
	}


