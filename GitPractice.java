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
				if (arr[j][i] %2 == 0 && !(i-1 < 0) && !(i+1 >= n) && arr[j][i+1]+arr[j][i-1] > 17)
					return arr[j][i];
		return -1;
	}
}