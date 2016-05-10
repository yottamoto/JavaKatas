package com.blackandwhat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Opens a text file and reads it line by line.
 * The user gives a search string. The class checks each line if it matches.
 * Print out the line if it matches.
 * Bonus points for listing the total number or occurrences.
 *
 *
 * Created by cca on 10.05.2016.
 */
public class FindOccurrences {

    public static void main(String[] args) {
        searchFile("bad");
    }

    public static void searchFile(String searchString) {
        // open the file
        File wordlist = new File("wordlist.txt");

        BufferedReader br = null;
        try {
            // go through the file line by line
            // check http://www.programcreek.com/2011/03/java-read-a-file-line-by-line-code-example/
            // for many examples
            br = new BufferedReader(new FileReader(wordlist));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
