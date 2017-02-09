/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author PERSONAL
 */
import java.util.*;
public class Function {

   static int subprogram(int z, int y, int x){
       
       int []vector= new int [3];
       if(z>x){
           if(z>y){
               if(x>y){
                   vector[1]=x;
                   vector[0]=y;
                   vector[2]=z;
               }
               vector[0]=x;
               vector[1]=y;
               vector[2]=z;
           }
           else{
                vector[0]=x;
                vector[2]=y;
                vector[1]=z;
               
           }
          
       }
       else{
           if(z<y){
               if(x>y){
               vector[2]=x;
               vector[1]=y;
               vector[0]=z;
               }
               vector[1]=x;
               vector[2]=y;
               vector[0]=z;         
           }
           vector[2]=x;
           vector[0]=y;
           vector[1]=z; 
       }
    
       return vector[2];
   }
   
    public static void main(String[] args) {
        int a,b,c;
        Scanner lec= new Scanner(System.in);
        System.out.println("Type number a");
        a=lec.nextInt();
        System.out.println("Type number b");
        b=lec.nextInt();
        System.out.println("Type number c");
        c=lec.nextInt();
        
        int biggernumber=subprogram(a,b,c);
        
        System.out.println("The bigger number is: "+biggernumber);
        
    }
    
}
