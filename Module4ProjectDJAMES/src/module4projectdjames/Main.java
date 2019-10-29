/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4projectdjames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class Main {
    
public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the path and name for the input file:");       
        String input = scan.nextLine();                                                     //gets user input
        
        Module4ProjectDJAMES linkedlist = new Module4ProjectDJAMES();

        File file = new File(input);                                                        //creates File object 
       
      
        if(file.exists()){                                                                  //checks to see if file path entered exists
            Scanner fileScan = new Scanner (file);                                          //used to scan data within file
            
            int lineNum = 0;
            while(fileScan.hasNextLine()){                                                  //checks to see if the next line is empty or not
                String line = fileScan.nextLine();
                String[] lineSplit = line.split("");                                        //splits the contents of the line into a String array
                lineNum++;
                
                if(line.contains("I")){                                                     //searches for the letter on that line
                    System.out.println("Processing I...");
                    System.out.println("The list has been initialized.");
                    System.out.println();
                }
                
                else if(line.contains("B")){
                    int n = Integer.parseInt(lineSplit[2]);                                 //gets the value in the data line
                    System.out.println("Processing B...");
                    System.out.println("Added the value " + lineSplit[2] + " to a node at the beginning of the list.");

                    linkedlist.addBeginning(n);                                             //does corresponding method
                    System.out.println();
                } 
                
                else if(line.contains("C")){
                    int n = Integer.parseInt(lineSplit[2]);
                    System.out.println("Processing C...");
                    System.out.println("Added the value " + lineSplit[2] + " to a node at the end of the list.");

                    linkedlist.addEnd(n);
                    System.out.println();
                } 
                
                else if(line.contains("R")){
                    System.out.println("Processing R...");
                    System.out.println("Removed the node with the value " + lineSplit[2] + " from the beginning of the list.");
                    
                    linkedlist.removeBeginning();
                    System.out.println();
                }   
                
                else if(line.contains("S")){
                    System.out.println("Processing S...");
                    System.out.println("Removed the node with the value " + lineSplit[2] + " from the end of the list.");
                    
                    linkedlist.removeEnd();
                    System.out.println();
                } 
                
                else if(line.contains("T")){
                    System.out.println("Processing T...");
                    System.out.println("Traversing the list and it contains the following values: ");
                    linkedlist.traverse();
                    System.out.println();
                }   
                
                else if(line.contains("X")){
                    linkedlist.exit();
                }    
            }
        }
        

    }
}
