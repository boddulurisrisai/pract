import java.util.*;
class Loops14{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int p=sc.nextInt();
int flag=0;
if(p==0 || p==1){
System.out.println(p+" is neither prime nor composite");
}
else{
int a=(int)(p/2);
for(int i=2;i<=a;i++){
if(p%i==0){
flag=1;
break;
}
else{
flag=0;
}
}
if(flag==1){
System.out.println(p+" is not a prime number");
}
else{
System.out.println(p+" is a prime number");
}
}
}
}