import java.util.Arrays;
class Arrays7{
public static void main(String[] args){
Arrays.sort(args);
int n=args.length;
int t[]=new int[n+1];
int k=0;
for(int i=0;i<n-1;i++){
if(args[i].equals(args[i+1])){
continue;
}
else{
t[k]=Integer.parseInt(args[i]);
k++;
}
}
t[k]=Integer.parseInt(args[n-1]);
for(int i=0;i<=k;i++){
System.out.print(t[i]+" ");
}
}
}