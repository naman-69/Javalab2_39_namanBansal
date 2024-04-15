package naman;
import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {

	public twoDArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int arr[][] = new int [3][];
		Scanner myArr = new Scanner(System.in);
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=myArr.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println(Arrays.deepToString(arr));

	}

}
