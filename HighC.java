// HighC
// SIMPHIWE MCHUNU
// 14 SEPTEMBER 2016


public class HighC implements Student{
   private String name;
   private int mark;
   private String category;
   private int pracs;
   private int practests;
   private int exam;
   private int tests;
      
    public void setName(String name){
      this.name = name;
      }
      
    public String getName(){
      return name;
      }
      
     public void setMark(String category, int mark){
      if(category.equals("pracs")){
         pracs = mark;
         }
      else if(category.equals("practests")){
         practests = mark;
      }
      else if(category.equals("tests")){
         tests = mark;
       }
      else{
         exam = mark;
        }
     }
     
    public float getFinal(){
         return 0.15f*pracs + 0.15f*tests + 0.10f*practests + 0.60f*exam;
       }
    
}
