class Arrays9{
public static void main(String[] args){
int n=args.length;
int a[]=new int[n];
for(int i=0;i<n;i++){
int p=Integer.parseInt(args[i]);
a[i]=p;
}
if(n!=4){
System.out.println("Please Enter 4 digit number");
}
else{
System.out.println("The given array is");
System.out.println(a[0]+" "+a[1]);
System.out.println(a[2]+" "+a[3]);
System.out.println("The reverse array is");
System.out.println(a[3]+" "+a[2]);
System.out.println(a[1]+" "+a[0]);
}
}
}

