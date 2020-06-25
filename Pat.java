class Pat{
public static void main(String[] args){
Patient p=new Patient("srisai",5.7,70.2);
System.out.println(p.name+" "+p.computeBMI());
}
}
class Patient{
String name;
double height;
double weight;
Patient(String name,double height,double weight){
this.name=name;
this.height=height;
this.weight=weight;
}
double computeBMI(){
return ((weight)/(height*height));
}
}
