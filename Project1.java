import java.util.*;
class Project1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a[][]={{"1001","Ashish","01/04/2009","e","R&D","2000","8000","3000"},
{"1002","Sushma","23/08/2012","c","PM","3000","12000","9000"},
{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
{"1004","Chahat","29/01/2013","r","FrontDesk","12000","6000","2000"},
{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
String b[][]={{"e","Engineer","20000"},
{"c","Consultant","32000"},
{"k","Clerk","12000"},
{"r","Recceptionist","15000"},
{"m","Manager","40000"}};
System.out.println("enter emp id");
String key=sc.next();
String desg="";
int da=0;
int flag=0;
for(int i=0;i<7;i++){
if(a[i][0].equals(key)){
String c=a[i][3];
switch(c){
  case "e":desg="Engineer";
    da=20000;
    break;
  case "c":desg="Consultant";
    da=32000;
    break;
  case "k":desg="Clerk";
    da=12000;
    break;
  case "r":desg="Receptionist";
    da=15000;
    break;
  case "m":desg="Manager";
    da=40000;
    break;
}
    
int base=Integer.parseInt(a[i][5]);
int hra=Integer.parseInt(a[i][6]);
int it=Integer.parseInt(a[i][7]);
int sal=base+hra+da-it;
System.out.println("EmpNo"+" "+"EmpName"+" "+"Department"+" "+"Designation"+"  "+"Salary");
System.out.println(a[i][0]+"  "+a[i][1]+"  "+a[i][4]+"  "+desg+"  "+sal);
flag=1;
}
}
if(flag==0){
System.out.println("There is no employee with empid:"+key);
}
}
}
