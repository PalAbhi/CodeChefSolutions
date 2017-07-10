import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import StringUtils;
import java.lang.*;
 
class WhatsintheName {
    public static void main(String[] args) {
       
        String str;
        String str1,str2;
        str=null;
        int mm,test,position=0,i;
        Scanner object = new Scanner(System.in);
        mm=object.nextInt();
        while(mm>0){
                str=object.nextLine();   
                str2="\0";
                if(str.length()<2)
                {
                    str=object.nextLine();
                }
                str1=" "+str.trim();
                if(str1.lastIndexOf(' ')==str1.indexOf(' ')){
                    str2+=Character.toUpperCase(str1.charAt(1));
                    str2+=str1.substring(2,str1.length()).toLowerCase();
                    System.out.println(str2.trim());
                }
                else{
                    position=str1.lastIndexOf(' ');
                    test=0;
                    while(position!=test)
                    {
                        str2+=Character.toUpperCase(str1.charAt(test+1));
                        i=test;
                        test=str1.indexOf(' ',test+1);
                        str2+=". ";
                        
                    }
                    str2+=Character.toUpperCase(str1.charAt(position+1));
                    str2+=str1.substring(position+2,str1.length()).toLowerCase();
                    System.out.println(str2.trim());
                }
            mm--;
            }
        }
}  