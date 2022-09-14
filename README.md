# Criminal Database

**This is the final project of 21 Fa CPT 111 Java Programming of XJTLU**

## Overview

The person database has a number of functionalities, and a full interface is provided which allows the user to select one of these options, and input a string. The complete framework has been provided, and so you need to complete the methods.  Note, you should not create any new methods, and should only complete the existing methods.  The database is a CSV (comma separated values) file, which contains a number of fields and file paths to their photographs. 

## Functionality

1. Load Person File

To load a file, there is a readFile() method in the FileUtils class which needs to read a text file.  There is also a Person class, which is used to create Person objects, and this must be completed (constructors, getters, and other methods). Finally, in the Menu class, there is a loadfiles() method, which receives a file name string and an empty list, and returns a populated list. 

2. List all Persons

After loading a file, in the Menu class, there is a listIDs() method, which uses the toString() method in the Person class to display all information about the persons. 

3. Search for a Person

Here, in the Menu class, there is a searchIDs() method, which receives a list of persons and a search String. Here, a fully completed method will look for partial and full matches using the input string, and will allow you to search by first name, nickname, family name, id, and nationality. And display the list of matches and the total number of matches. The search should not be case sensitive. 

4. Generate a Wanted Poster

Sometimes, persons are wanted for their offenses, and here we will use graphics to generate a Wanted poster to catch the offenders.  You should input an exact match for the ID code and call the generatePoster() method.  This will check for a match, create a JFrame, and then create an ImagePanel object.  The ImagePanel object receives a Person object and uses the paintComponent() method to display a suitable poster. More information on the poster will be provided below.

5. Generate Stats

We want to generate statistics about our database.  These statistics are the number of persons, the number of nationalities, average age, and the percentage of males and females. These are displayed by the generateStats() method.

6. Check for ID Fraud

Due to a hacking incident, a number of persons had their ID’s changed to try and evade detection. You must complete the checkFraud() method, which receives a list of IDs and an input String of the chosen ID code, and will return whether the ID code is correct (true), or incorrect (false). More information on the ID checking will be provided below. 
