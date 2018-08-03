//count number of words in a file
package com.assignment.countwords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner get = new Scanner(System.in);

		String path;
		int wordCount = 0;

		System.out.println("Enter file path");
		path = get.next();// takes the file path
		get = new Scanner(new FileInputStream(path));// passing path to scanner

		while (get.hasNext()) {// count the number of words
			get.next();
			wordCount++;
		}

		System.out.println("Number of words in file are: " + wordCount);// prints the number of words
	}

}
