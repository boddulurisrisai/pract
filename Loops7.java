class Loops7{
public static void main(String[] args){
char ai='D';
int temp;
if(ai>='a' && ai<='z'){
System.out.print(ai+" ->  ");
temp=(int)ai;
ai=(char)(temp-32);
System.out.println(ai);
}
else{
System.out.print(ai+" ->  ");
temp=(int)ai;
ai=(char)(temp+32);
System.out.println(ai);

}
}
}
