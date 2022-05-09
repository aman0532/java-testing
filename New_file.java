

import java.util.*;
import java.io.*;
import java.util.Collections;

public class New_file{
       //for craeting file aur directory for method 
      public static void create_file_name(String default_path)
         {
         try {
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
            }
            System.out.println("ENTER NEW FILE NAME");
            String new_filename=sc.next();

            File file = new File(default_path + "/" + new_filename);  

            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
          } catch (IOException e) {  
            e.printStackTrace();  
         }
         
        }


        //for searching file or directory in this method
        public static void serch_File(String default_path)
        {
       
  
        // store all names with same name
        // with/without extension
        Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
            }

        File file = new File(default_path); 
        String[] f_list = file.list();
         List<String> wordList = Arrays.asList(flist);
            
        System.out.println("ENTER FILE NAME WHICH YOU WANT TO SEARCH");
        String file_name=sc.next();

         boolean ans = arrayList.contains(file_name);
  
        if (ans)
            System.out.println("FILE_NAME FOUND="+file_name);
        else
            System.out.println("FILE_NAME FOUND ="+file_name);
      
        }
        //for getting sorting purpose 
        public static void sorting_accending_order(String default_path)
        {
            
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
            }

            File file = new File(default_path); 
             String[] flist = file.list();
        
             List<String> wordList = Arrays.asList(flist);
             Collections.sort(wordList);      
             wordList.forEach((n) -> System.out.println(n));
              

        }

        //for deleting file or dirctory
        public static void delete_file(String default_path)
        {
            
            Scanner sc=new Scanner(System.in);   
            System.out.println("WANT CHANGE PATH Press C");
            char ch=sc.next().charAt(0);
            if(ch=='c'){
                System.out.println("ENTER THE PATH LOCATION");
                default_path=sc.next();
            }
            System.out.println("ENTER THE NAME WHICH FILE YOU WANT TO DELETE");
            String file_name=sc.next();

            File file = new File(default_path + "/" + file_name); 
 
        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
        
        }
        public static void running(String default_path)
        {
        	 Scanner sc=new Scanner(System.in);
            System.out.println("PRESS C FOR CREATING FILE");
            System.out.println("PRESS S FOR SERCHING FILE");
            System.out.println("PRESS A FOR ASSENDING ORDER FILE");
            System.out.println("PRESS D FOR DELETEING FILE");
            System.out.println("PRESS E FOR EXIT APPLICATION");
            String st=null;
            char ch;
            ch=sc.next().charAt(0);
            switch(ch)
            {

                case 'c':
                            create_file_name(default_path);
                            running(default_path);
                            break;

                case 's':
                            serch_File(default_path);
                            running(default_path);
                            break;   

                case 'a':
                            sorting_accending_order(default_path);
                            running(default_path);
                            break;          

                case 'd':
                            delete_file(default_path);
                            running(default_path);
                            break;

                case 'e':
                                System.out.println("THANKS FOR VISITING ON APPLICATION");
                                break;

                default:
                            System.out.println("WRONG CHOICE");
                            running(default_path);
            }

        }
        public static void main(String args[])
       {
        	System.out.println("\t\t\t************************************************************");
            System.out.println("\t\t\t\t\t WELCOME FILEHANLING PROGRSME");
          
            System.out.println("\t\t\t************************************************************");
            System.out.println("\t\t\tNAME::  RISHU GOSWAMI");
            System.out.println("\t\t\tDESIGNATION:: TRAINEE");
            System.out.println("\t\t\t************************************************************");
        //calling function for all function   
        String default_path="C:\Users\Jarvis\OneDrive\Documents\c++ programes";//you have to give your pc folder location here
        running(default_path);
       

       }     

}        