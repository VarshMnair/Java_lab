class Factorial
{ 
   
    int factorial(int n) 
     {
        if (n>1) 
         {
        return (n*factorial(n-1)); 
         }
        else
        {
        return 1;
        }
    } 

}
      
class Fact
{
    public static void main(String[] args)  
    {  
       Factorial f=new Factorial();
       int ans=f.factorial(5);
        System.out.println("Factorial is "+ans); 
    } 
} 