/*
    * Jonas Wiesinger
    * 1. Test SEW
    * Aufgabe 1
    * 16.11.2018
 */

package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        int lines = getNoOfLines(text);
        print(text, lines);
    }

    public String[] readFromFile(String fileName) {

        StringBuilder sb = new StringBuilder();

        try(Scanner scanner = new Scanner(new FileReader(fileName))){
            while(scanner.hasNextLine()){
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }

        String[] fileArray = sb.toString().split("\n");

        return fileArray;
    }

    public static void print(String[] text, int lines) {
        for (int i = 0; i < lines; i++) {
            if(text[i].length() == 2){
                for (int j = 0; j < text[i].charAt(1) - 48; j++) {
                    System.out.print(text[i].charAt(0));
                }
            }else if(text[i].length() == 3){
                for (int j = 0; j < (text[i].charAt(1) - 48)*10 + (text[i].charAt(2) - 48); j++) {
                    System.out.print(text[i].charAt(0));
                }
            }
            System.out.println();
        }
    }

    public static int getNoOfLines(String[] fileArray) {

        int lines = fileArray.length;

        return lines;
    }
}
