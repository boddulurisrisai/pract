class Loops18{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
int p=a,rem=0,rev=0;
while(a>0){
rem=a%10;
rev=rev*10+rem;
a=a/10;
}
if(p==rev){
System.out.println(p+" is a palindrome");
}
else{
System.out.println(p+" is not a plaindrome");
}
}
}