// Java program to print all permutations of a 
// given string. 
public class Permutation { 

	// Function call 
	public static void main(String[] args) 
	{ 
		int[] str = {1,2,3}; 
		int n = str.length; 
		Permutation permutation = new Permutation(); 
		permutation.permute(str, 0, n - 1); 
	} 

	
	private void permute(int[] str, int l, int r) 
	{ 
		if (l == r) {
			System.out.print(str[0]+" "+str[1]+" "+str[2]); 
			System.out.println();
			return;
		}
		else { 
			for (int i = l; i <= r; i++) { 
				swap(str, l, i); 
				permute(str, l + 1, r); 
				swap(str, l, i); 
			} 
		} 
	} 

	
	public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 

// This code is contributed by Mihir Joshi
