import java.lang.*;
import java.math.*;
import java.util.*;

class repeating{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many number you want to enter: ");
		int n = sc.nextInt();
		System.out.println("You enterd: "+ n);
		int[] array = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter "+ i +" number: ");
			array[i] = sc.nextInt();
		}
		int[] newarray = new int[n];
		int c = 0;
		int check = 1;
		for(int i=0; i<n; i++){
			check = 1;
			for(int j=i-1;j>=0;j--){
				if(array[i] == array[j]){
					System.out.println("Breaked");
					check = 0;
				}
			}
			if(check == 1){
				System.out.println(array[i] + " Number got inserted");
				newarray[c] = array[i];
				c++;
			}

		}
		System.out.print("After removing all the repeating elements: ");
		for(int i=0; i<c; i++){
			System.out.print(newarray[i]+"\t");
		}
	}
}
