import java.util.*;
class Arrays1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a[]={5,2,3,4,5};
int sum=0;
for(int i=0;i<a.length;i++){
sum+=a[i];
}
int avg=sum/a.length;
System.out.println(sum);
System.out.println(avg);
}
}