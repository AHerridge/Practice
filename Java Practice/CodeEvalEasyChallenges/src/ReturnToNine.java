public class ReturnToNine
{
	public static void main(String[] args)
	{
		doMath(945669156);
	}

	public static void doMath(long num)
	{
		String strNum = num + "";
		while (strNum.length() > 1)
		{
			long total = 0;
			for (char val : strNum.toCharArray())
				total += Integer.parseInt((String) (val + ""));
			num -= total;
			strNum = num + "";
			System.out.print(strNum + "\t");
			if (total != 9)
				doMath(total);
			else
				System.out.println();
		}
	}
}
