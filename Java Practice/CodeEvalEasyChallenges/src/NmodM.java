import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NmodM
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null)
		{
			String[] props = (line = line.trim()).split(",");
			int n = Integer.parseInt(props[0]), m = Integer.parseInt(props[1]);
			System.out.println(n - m * (n / m));
		}
	}
}
