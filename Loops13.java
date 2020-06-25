import java.util.*;
class Loops13{
public static void main(String[] args){
int flag=0;
for(int i=10;i<=99;i++){
int p=(int)(i/2);
for(int j=2;j<=i;j++){
if(i%j==0){
flag=1;
break;
}
else{
flag=0;
}
}
if(flag==1){
System.out.println(i+" is a Prime");
}
else{
System.out.println(i+" Not a Prime");
}
}
}
}