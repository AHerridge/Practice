import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null)
		{
			line = line.trim();
			// Process line of input Here
			String[] strProps = line.split(" ");
			printGame(Integer.parseInt(strProps[0]), Integer.parseInt(strProps[1]), Integer.parseInt(strProps[2]));
		}
		buffer.close();
	}

	public static void printGame(int x, int y, int n)
	{
		String game = "";
		for (int i = 1; i <= n; i++)
		{
			String value = "";
			if (i >= x && i % x == 0)
				value += "F";
			if (i >= y && i % y == 0)
				value += "B";
			if (value.isEmpty())
				value += i;
			value += " ";
			game += value;
		}
		System.out.println(game.trim());
	}
}
