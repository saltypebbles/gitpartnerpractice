import java.util.Scanner;

public class GitPractice
{
	private static int[][] arr;
	public static void main(String[] args)
	{
		System.out.println("nandhuuu");

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = reader.nextInt();
		squareArray(num);
		System.out.println(find(num));
	}

	public static void squareArray(int n)
	{
		arr = new int[n][n];
		for (int i = 0; i<n; i++)
			for (int j = 0; j<n; j++)
				arr[i][j] = (int)(Math.random()*10)+1;
	}

	public static int find(int n)
	{
		for (int i = 0; i<n; i++)
			for (int j = 0; j<n; j++)
				if (arr[j][i] %2 == 1 && !(i-1 < 0) && !(i+1 >= n) && !(j-1 < 0) && !(j+1 >= n)  && arr[j][i+1]+arr[j][i-1]+arr[j+1][i]+arr[j+1][i] > 33)
					return arr[j][i];
		return -1;
	}
}