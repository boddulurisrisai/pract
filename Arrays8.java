class Arrays8{
public static void main(String[] args){
int c=0,d=0;
for(int i=0;i<args.length;i++){
int e=Integer.parseInt(args[i]);
if(e==6){
c=i;
}
if(e==7){
d=i;
}
}
int sum=0;
for(int i=0;i<args.length;i++){
if(c<d){
if(i>=c && i<=d){
continue;
}
else{
sum+=Integer.parseInt(args[i]);
}
}
else{
sum+=Integer.parseInt(args[i]);

}
}
System.out.println(sum);
}
}
