import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TrickOrTreat
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
			String[] strProps = line.split(", ");
			printAvgCandy(Integer.parseInt(strProps[0].split(" ")[1]), Integer.parseInt(strProps[1].split(" ")[1]),
					Integer.parseInt(strProps[2].split(" ")[1]), Integer.parseInt(strProps[3].split(" ")[1]));
		}
		buffer.close();
	}

	public static void printAvgCandy(int vCount, int zCount, int wCount, int hCount)
	{
		double total = 0;
		total += vCount * hCount * 3.0;
		total += zCount * hCount * 4.0;
		total += wCount * hCount * 5.0;
		System.out.println((int) (total / (vCount + zCount + wCount)));
	}
}
