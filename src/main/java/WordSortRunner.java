//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Callum Sears

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		WordSort ws2 = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		WordSort ws3 = new WordSort("b x 4 r s y $");
		WordSort ws4 = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
        
		
		//run test cases here
		ws.sort();
		ws2.sort();
		ws3.sort();
		ws4.sort();

		System.out.println(ws);
		System.out.println(ws2);
		System.out.println(ws3);
		System.out.println(ws4);
	}
}