
public Positivenumberwhile
{
public static void main(String[] args)
{ 
   Scanner scan = new Scanner(System.in);
   System.out.print("Please enter a positive number: ");
   int response= scan.nextInt();
   
   While (response <= 0)
   {
     System.out.println("Error! Please try aganin.");
     System.out.print("Please enter a positive number: ");
     response = scan.nextInt();
   
   
   }
      System.out.print("The positive number is: "+ response);


}
}
