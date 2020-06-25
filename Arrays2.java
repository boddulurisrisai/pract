class Arrays2{
public static void main(String[] args){
int a[]={12,34,56,78,91,738};
int max=-1,min=10000;
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
if(a[i]<min){
min=a[i];
}
}
System.out.println("Maximum is"+max);
System.out.println("Minimum is"+min);
}
}