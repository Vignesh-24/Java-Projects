package prepare;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the crosswordPuzzle function below.
    static String[] crosswordPuzzle(String[] crossword, String words) {
        String names[]=words.split(";");
        int total_words=names.length;
        String temp="";
        String temp1="";
        Map<Integer,Integer> vertical=new HashMap<Integer,Integer>();
        Map<Integer,Integer> horizontal=new HashMap<Integer,Integer>();
        for(int i=0;i<10;i++)
        {
            temp=crossword[i];
            for(int j=0;j<10;j++)
            {
                if(temp.charAt(j)=='-')
                {
                    if(vertical.containsKey(j))
                        vertical.put(j,vertical.get(j)+1);
                    else
                    	vertical.put(j, 1);
                    if(horizontal.containsKey(i))
                        horizontal.put(i,horizontal.get(i)+1);
                    else
                    	horizontal.put(i, 1);
                    
                    
                }

            }
        }
        System.out.println(vertical);
        System.out.println(horizontal);
		return crossword;

 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        String[] crossword = new String[10];

        for (int i = 0; i < 10; i++) {
            String crosswordItem = scanner.nextLine();
            crossword[i] = crosswordItem;
        }

        String words = scanner.nextLine();

        String[] result = crosswordPuzzle(crossword, words);

        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
        }

        scanner.close();
    }
}
