
// ArrayListTest class
// ArrayList
// SIMPHIWE MCHUNU
// 14 SEPTEMBER 2016



import java.util.*;
public class ArrayListTest
   {
   public static void main(String args[])throws Exception{
   Scanner input = new Scanner(System.in);
   ArrayList<String> myList = new ArrayList();
   while(true){
      System.out.println("Enter option: (1) add soft drink (2) quit:");
      int n = input.nextInt();
      input.nextLine();
      if(n==1){
         System.out.println("Enter name, colour and volume in ml separated by space");
         String k = input.nextLine();
         myList.add(k);
      }
      else{
         break;
        }
     }
    Collections.sort(myList);
    for(int item = 0;item<myList.size();item++){
          System.out.println(myList.get(item));
       }
   }
}




