import java.util.*;
class Pattern4{
public static void main(String args[]){
for(int i=0;i<10;i++){
for(int k=0;k<9-i;k++)
System.out.print("  ");
for(int j=0;j<=i;j++){
System.out.print((j+1)+" ");
}
for(int l=i;l>0;l--)
System.out.print((char)(l+64)+" ");
System.out.println();
}
}
}