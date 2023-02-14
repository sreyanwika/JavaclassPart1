package javaClass;
//finding the area of square and rectangle by using constructors default and parametarized...
class shape{
	private
	 int l;
	 int b;
	 public
	  shape() {
		 l=10;
		 b=5;
		 
	 }
	 shape(int leng){
		 l=leng;
		 b=leng;
	 }
	 shape(int len,int wid){
		 l=len;
		 b=wid;
	 }
	 void square(){
		 int area=1;
		 area=l*l;
		 System.out.println("the squatre area is:"+area);
		 
	 }
	 void rec(){
		 int area=1;
		 area=l*b;
		 System.out.println("the rectangle area is:"+area);
		 
	 }
}
public class Cdip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    shape a=new shape();
    a.square();
    a.rec();
    shape b=new shape(11,12);
    b.square();
    b.rec();
    shape c=new shape(13);
    c.square();
    //c.rec(); gives result of 0 bcz no parameter of width...
    
	}

}
