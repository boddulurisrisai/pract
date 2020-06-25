class Patterns1{
public static void main(String[] args){
for(int i=10-1;i>=0;i--){
int k=1;
for(int j=10-1;j>=0;j--){
if(i<=j){
System.out.print(k+" ");
k++;
}
}
System.out.println(" ");
}
}
}