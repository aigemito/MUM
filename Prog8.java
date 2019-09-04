package fppassignment;

public class Prog8 {
	
	public static void main(String[] args) {
		int[] arr = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		int minSoFar;	
		if(arr.length!=0 || arr!=null) {				
			minSoFar = arr[0];
			int len = arr.length;
			for(int i = 1;  i < len; ++i){
				if(arr[i]< minSoFar){
					minSoFar = arr[i];
				}
			}
			System.out.println("The minimum value in  [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22] is:" );
			System.out.println(""+ minSoFar);
		}
		
	}
	
}