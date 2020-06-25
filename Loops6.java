class Loops6{
public static void main(String[] args){
String a=args[0];
int b=Integer.parseInt(args[1]);
if(a.equals("Female")){
if(b>=1 && b<=58){
System.out.println("the percentage of intrest is 8.2");
}
else if(b>58 && b<101){
System.out.println("the percentage of intrest is 9.2");
}
}
else if(a.equals("Male")){
if(b>=1 && b<=58){
System.out.println("the percentage of intrest is 8.4");
}
else if(b>58 && b<101){
System.out.println("the percentage of intrest is 10.5");
}
}
}
}