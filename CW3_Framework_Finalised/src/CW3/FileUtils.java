/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrew.abel
 */
public class FileUtils {
       
    public static List<Person> readFile(String filename) {

        // Receive a filename String, and read a file, storing all person 
        // information in an arraylist, handling any file reading errors and
        // returning an array list
        
        // Complete this method
    	Path filepath = Paths.get(filename);
    	List<Person> ids = new ArrayList<Person>();
    	try {
			BufferedReader reader = Files.newBufferedReader(filepath);
			String lineContent = reader.readLine();
			while (lineContent != null)
			{
			Person p = new Person(lineContent);
			ids.add(p);
			System.out.println(lineContent);
			lineContent = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // temporary return line, change this
        return ids;
    }
}
