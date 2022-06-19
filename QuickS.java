import java.util.*;
import java.io.*;

class QuickS
    {
  public static void main(String args[])
    {
         
    Scanner sc=new Scanner(System.in);  
      int A[]=new int[5];
      int B[]=new int[5];
       System.out.println("enter 5 elements: ");
  
             for(int i=0;i<5;i++)
    
      {
     
        A[i]=sc.nextInt();
  
            }
       quicksort(A,0,4);
          }
  static void quicksort(int B[],int first, int last)
          {
      int i,j,temp,pivot;
    
       if (first < last)
   
         {
       
        pivot = B[first];
   
               i = first;
        
         j = last;
       
         while (i < j)
       
         {
           
             while ((B[i]<= pivot)&&(i<last))
   
                     i = i + 1;
        
               while((B[j] >= pivot)&&(j > first))
     
                   j = j - 1;
          
            if (i < j)
           
              {
         
                 temp = B[i];
                       B[i] = B[j];
                       B[j] = temp;
 
                   }
    
            }
        
          temp = B[j];
    
                       B[j] = B[first];
      
           B[first] = temp;
      
         
    System.out.println("\nsorting ");
  
          for (int k= 0; k<5; k++)
     
            { System.out.print(" "+B[k]);}

          System.out.println("\n");
          quicksort(B, first, j - 1);
                       quicksort(B, j + 1, last);
    
       }
     }
   }
    
      

