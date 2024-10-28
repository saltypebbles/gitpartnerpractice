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
	}

	public static void squareArray(int n)
	{
		arr = new int[n][n];
		for (int i = 0; i<n; i++)
		{
			for (int j = 0; j<n; j++)
			{
				arr[i][j] = (int)(Math.random()*10)+1;
			}
		}
	}
}