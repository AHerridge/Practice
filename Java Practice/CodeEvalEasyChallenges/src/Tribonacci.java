public class Tribonacci
{
	public static void main(String[] args)
	{
		for(double num:tribonacci(new double[]
		{
				1, 1, 1
		}, 10))
			System.out.print(num + " ");
	}

	public static double[] tribonacci(double[] s, int n)
	{
		if (n == 0)
			return new double[]
			{
					0
			};
		double[] sequence = new double[n];
		for (int i = 0; i < s.length; i++)
			sequence[i] = s[i];
		for (int i = 3; i < sequence.length; i++)
			sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
		return sequence;
	}
}
