import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BitPositions
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null)
		{
			String[] props = (line = line.trim()).split(",");
			System.out.println(
					props[0].charAt(Integer.parseInt(props[1])) == props[0].charAt(Integer.parseInt(props[2])));
		}
	}
}
