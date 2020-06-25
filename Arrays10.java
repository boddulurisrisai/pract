class Arrays10{
public static void main(String[] args){
int n=args.length;
int a[]=new int[n];
for(int i=0;i<n;i++){
int p=Integer.parseInt(args[i]);
a[i]=p;
}
if(n!=9){
System.out.println("Enter 9 digit number");
}
else{
int max=-1;
for(int i=0;i<n;i++){
System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]);
i=i+2;
}
for(int i=0;i<n;i++){
if(a[i]>max){
max=a[i];
}
}
System.out.println("The biggest number in the given array is"+max);
}
}
}