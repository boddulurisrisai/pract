import java.util.Arrays;
class Arrays5{
public static void main(String[] args){
int a[]={12,34,5,6,34,66,99,11,56,88,54,31};
Arrays.sort(a);
System.out.println(a[a.length-2]+","+a[a.length-1]);
System.out.println(a[0]+","+a[1]);
}
}