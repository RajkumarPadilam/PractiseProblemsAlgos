
public class FindKElement {

	public static void main(String[] args) {
		
		int[] a1 = {1,3,5};
		int[] a2= {2,6,9};
		int result = findKElement(a1, a2, 4);
		System.out.println(result);
		
	}
	
	public static int findKElement(int[] a1, int[] a2, int element) {
		
		int low1=0;int high1 =element;
		int low2=0; int high2=element;
		
		while(low1 < high1 && low2 < high2) {
			
			int mid1 = low1+ (high1 - low1)/2;
			int mid2 = low2+ (high2 - low2)/2;
			
			if(a1[mid1] < a2[mid2]) {
				low1 = mid1+1;
				high2 = mid2-1;
			}else if(a2[mid2] < a1[mid1]) {
				low2 = mid2+1;
				high1 = mid1 - 1;
			} else
				return a1[mid1];
		}
		return (low1>0 && low1<a1.length)?a1[low1]:(high1>0 && high1<a1.length)?a1[high1]:(low2>0 && low2<a2.length)?a2[low2]:a2[high2];
		
	}
}
