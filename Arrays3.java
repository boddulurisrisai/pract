class Arrays3{
public static void main(String[] args){
int a[]={1,3,4,5,6,7,8};
int key=Integer.parseInt(args[0]);
int c=0,flag=0;
for(int i=0;i<a.length;i++){
if(a[i]==key){
flag=1;
c=i;
break;
}
else{
flag=0;
}
}
if(flag==1){
System.out.println(c);
}
else{
System.out.println(-1);
}
}
}