import java.util.*;
class Loops12{
public static void main(String[] args){
int flag=0;
for(int i=10;i<=99;i++){
if(a%i==0){
flag=1;
break;
}
else{
flag=0;
}
}
if(flag==1){
System.out.println("Prime");
}
else{
System.out.println("Not a Prime");
}
}
}