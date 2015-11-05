package org.meltwater.java.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class SpellChecker{
	
	public static String[] readFile(String filename) {
		
		ArrayList<String> fileContent = new ArrayList<String>();
		String[] entry;
		
		try
		{
			BufferedReader fileData = new BufferedReader(new FileReader(filename));
			
			while(fileData.readLine() != null)
			{
				entry = fileData.readLine().split("\\s+");
				System.out.println("The entry string is " +Arrays.toString(entry));
				for(String e : entry)
				{
				fileContent.add(e);
				}
			}
			
			fileData.close();
		
		} catch (Exception e)
		{
			System.out.println("The while loop has encountered an error : " +e);
		}
		
		String[] returnContent = fileContent.toArray(new String[fileContent.size()]);
		return returnContent;
		
	}
	
	public static void writeFile(String str) throws Exception{
		
		BufferedWriter fileData = new BufferedWriter(new FileWriter("corrected-data.txt"));
		if(fileData.equals(null)){
		fileData.write(str);
		} else {
			fileData.append(str);
		}
		fileData.close();
	}
	
	public static void main(String[] args) throws Exception{
		
		String dFile = args[0];
		String dictFile = args[1];
		Trie dictionary = new Trie();
		
		String[] array = readFile(dictFile);
		for(String s : array){
			dictionary.addWord(s);
		}
		
		String[] arrayData = readFile(dFile);
		for(String add : arrayData){
			boolean x = dictionary.searchDictionary(add);
			System.out.println("The word searched is : "+add + " The return value is : "+x);
			if(!x){
				System.out.println("Not in the dictionary");
			} else {
				writeFile(add);
				System.out.println("The word exists : " +add);
			}
		}
	}
}