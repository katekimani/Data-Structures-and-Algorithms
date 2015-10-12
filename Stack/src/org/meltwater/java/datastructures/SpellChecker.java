package org.meltwater.java.datastructures;
/**
 * Source code reference: http://pathakalgo.blogspot.in/2012/11/trie-data-structure-implementation-in.html
 * 
 * Accepts 2 files from the console input file.txt and dictionary.txt.
 * Checks if the spelling of words in file.txt match what the dictionary.txt contains.
 * Replaces the misspelled words in file.txt with the spelling used in dictionary.txt.
 * Writes the checked and corrected file contents to file-corrected.txt
 * 
 * @author katekimani
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpellChecker {

	public static String[] readFile(File filename) {
		BufferedReader readBuffer = null;
		String[] words ={};	String oneLine;		
		try {
			readBuffer = new BufferedReader(new FileReader(filename));
				while ((oneLine = readBuffer.readLine()) != null) {
					words = oneLine.split("\\s+");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (readBuffer != null) readBuffer.close();
				} catch (IOException readException) {
					readException.printStackTrace();
				}
			}
		return words;
		}
	
	
	public static void fileWrite(String text){
		try{
		String filename = "corrected-data.txt";
		FileWriter data = new FileWriter(filename, true);
		data.append(text);

		data.flush();
		data.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		File dataFile = new File("args[0]");
		File dictWords = new File("args[1]");
		String correctText ="", correction;
		boolean found;
		Node rootNode = Trie.Trie();
		
		String[] dictionary = readFile(dictWords);
		for(String s : dictionary){
			Trie.addWord(rootNode, s);
		}
		
		String[] words = readFile(dataFile);
		for(String s : words){

			if(Trie.searchDictionary(s)){
				correctText += s +" ";
			}else{
				int offset = s.length()-1;
				String str = s.substring(0, offset);
				found = Trie.searchDictionary(str);
				if(found){
					correction = s.replace(s,str);
					correctText += correction +" ";
				} else {
					correctText += "noMatch ";
				}
			}
		}
		 fileWrite(correctText);
		 
		
					
	}
}
