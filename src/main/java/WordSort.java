//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Callum Sears

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		String output="";
		
		for (String w : wordRay) {
			output += w + "\n";
		}
		return output + "\n";
	}
}