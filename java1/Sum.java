
// package java1;

// public class Sum {

//   public static int sum(int a, int b) {
//     int sum = 0;
//     return sum=a+b;
//   }
//   public static int sub(int a, int b) {
//     int sub = 0;
//     return sub=a-b;
//   }
//   public static int mul(int a, int b) {
//     int mul = 0;
//     return mul=a*b;
//   }
//   public static int div(int a, int b) {
//     int div = 0;
//     return div=a/b;
//   }

//   public static void main(String[] args) {
//     System.out.println(sum(10, 20));
//     System.out.println(sub(20, 40));
//     System.out.println(mul(10, 20));
//     System.out.println(div(20, 10));

//   }
// }
// Write  a  class  definit
// ion  for  Date,  an  object  type  that 
// contains  three  integers-  year,  month  and  day.  This  class 
// should provide two constructors. The first should take no 
// parameters.  The  second  should  take  parameters  named 
// year, month and day; and use them to initialize the 
// instance  variables.  Write  a  main  method  that  creates  a 
// new  Date  object  named  birthday. The  new  object  should 
// contain your birthdate. You can use either constructor
public class Date{
  int year;
  int month;
  int day;
  public Date(){
    this.year=0;
    this.month=0;
    this.day=0;
  }
  public Date(int year,int month,int day){
    this.year=year;
    this.month=month;
    this.day=day;
  }
  public void birthdate(){
    System.out.println(year+"/"+month+"/"+day);
  }
  public static void main(String[] args){
    Date birthday=new Date(1995,10,10);
    birthday.birthdate();
  }
} 