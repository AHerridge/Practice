import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseSentences
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null)
			printReverse(line.trim());
		buffer.close();
	}

	public static void printReverse(String string)
	{
		String[] words = string.split(" ");
		for (int i = 0; i < words.length / 2; i++)
		{
			String temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}
		String reversedSentence = "";
		for(String word : words)
			reversedSentence += word + " ";
		System.out.println(reversedSentence.trim());
	}
}
