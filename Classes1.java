class Box{
int l,h,w;
Box(int l,int h,int w){
this.l=l;
this.h=h;
this.w=w;
}
int volume(){
int v=l*h*w;
return v;
}

public static void main(String[] args){

Box b=new Box(12,34,56);
int q=b.volume();
System.out.println(q);
}
}