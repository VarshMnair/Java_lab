class Transpose
{
  public static void main(String ar[])
  {
   int a[][]={ {40,53,56},{10,20,30},{67,78,89} };
   int trnsp[][]=new int[3][3];
   System.out.println("The original Matrix is ");
   for(int i=0;i<3;i++)
     { 
       for(int j=0;j<3;j++)
         System.out.print(a[i][j]+" ");
       System.out.println();
      }
   for(int i=0;i<3;i++)
    {    
     for(int j=0;j<3;j++)
     {    
      trnsp[i][j]=a[j][i];  
     }  
    }  
   System.out.println("Printing Matrix After Transpose:");  
    for(int i=0;i<3;i++) 
     {    
       for(int j=0;j<3;j++) 
        {    
          System.out.print(trnsp[i][j]+" ");    
         }    
      System.out.println();   
     }  
  }
}    