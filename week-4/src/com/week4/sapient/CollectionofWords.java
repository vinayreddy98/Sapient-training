package com.week4.sapient;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionofWords
{
	public static void main(String[] args) {
	   HashMap<String, Set<String>> v = new HashMap<String, Set<String>>();
         Set<String> set1 = new HashSet<String>(Arrays.asList("GoodMorning","Shubhodaya","Shubhohday","Bonjour"));
         Set<String> set2 = new HashSet<String>(Arrays.asList("good Evening","Shubha sange","susandhya","Bonsoir"));
         v.put("GoodMorning",set1);
         v.put("Good Evening",set2);
       
         Scanner sc = new Scanner(System.in);
         while(true){
          System.out.println("enter the keyword u r searching for (or) 0 to exit ");
          String input = sc.nextLine();
          if(input.charAt(0) == '0'){
            break;
          }
          Set<String> temp = v.get(input);
          if(temp!= null){
            for(String k : temp){
              System.out.println(k);
            }
          }
          else
          {
            System.out.println("The keyword u entered is not in our list, would you like to add it? press Y for yes or N to exit");
            String res = sc.nextLine();
            if(res.charAt(0) == 'N')
                break;
            if(res.charAt(0) == 'Y'){
              System.out.println("Enter the keyword");
              String key = sc.nextLine();
              System.out.println("Enter the words now and press 0 after completing");
              Set<String> New = new HashSet<String>();
              while(true){
                String wrd = sc.nextLine();
                if(wrd.charAt(0) == '0')
                {
                    break;
                }
                New.add(wrd);
              }
              v.put(key,New);
            }
          }
         }  
        sc.close();
      
      }
   }


