package JavaPrograms.ArrayExample;

public class ArrayMDEx {

	public static void main(String[] args) {
		int[][] arr; // array decalaration -- [row][column];
		int[][] arr1 = {{9,55,77}, {3,8,12}, {79,44,2}}; // initialization
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
