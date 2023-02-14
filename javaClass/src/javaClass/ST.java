package javaClass;
class A{
private
  String empid;
  String name;
  int age;
  double salary;
static double ttl=0;
static int count=0;
public A(String a,String b,int c,double d){
empid=a;
name=b;
age=c;
salary=d;
ttl+=salary;
count++;
}
void display() {
System.out.println("\nthe employee id is:"+empid+"\nthe name is:"+name+"\nthe age is:"+age+"\nthe salary is:"+salary);

}
static void D() {
System.out.println("the total salary is:"+ttl+"the count is:"+count);
}

}

public class ST {

public static void main(String[] args) {
A a=new A("1cv22","xyz",18,17500.75);
a.display();
a.D();
A b=new A("1ca23","xz",18,19500.75);
b.display();
b.D();


}

}

