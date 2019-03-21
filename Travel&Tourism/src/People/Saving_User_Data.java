/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import java.io.*;
import java.util.*;
import java.io.Serializable;
import static travel.tourism.TravelTourism.UserLib;

/**
 *
 * @author Mostafa
 */
public class Saving_User_Data extends User implements IFileData,Serializable{
    
    public boolean load()
   {
       try
       {         
         ObjectInputStream Inp = new ObjectInputStream (new FileInputStream("C:\\oopproject\\Travel&tourism\\Users Data.bin"));
         System.out.println("Users Data loaded Successfully");
         //UserLib = (ArrayList<User>) Inp.readObject();
return true;
    } 
       catch (IOException e)
       {       
           System.out.println("Couldn't find the file");
       return false;
   }
   }
    public boolean save()
    {
           try {
               ObjectOutputStream Out = new ObjectOutputStream (new FileOutputStream("C:\\oopproject\\Travel&tourism\\Users Data.bin"));
               System.out.println("Username registration successfull");
                   //Out.writeObject(UserLib);
                   Out.close();
              
                   return true;
           } catch (FileNotFoundException e)
           {
               System.out.println("Filenotfound exception found");
               return false;
           }
           catch(IOException e)
           {
               System.out.println("IOException found ");
               return false;
           }
    }
    
}
