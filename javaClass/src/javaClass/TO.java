package javaClass;

//we wont get proper output bcz both threads are working on same object table..to avoid this synchronization should b implemented(mns...no othr thread shld access the obj wn 1 thread is using it..
class table {
	private int n1;
	public
	  void Printtable(int n) {
		n1=n;
		for(int i=1;i<=10;i++) {
			System.out.println(n1/*n can also b written*/+"x"+i+"="+n1*i);
			try {//here v are including sleeep method so that other threads can execute....
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {//catch method is compulsoryyy...to catch the errors of tryy
				System.out.println("i catcheddd");
			}
		}
	}
}
class T1 extends Thread{
	table a;
	T1(table a){
		this.a=a;//current variable is allocated to local variableeee
	}
	public 
	  void run() {
		a.Printtable(4);
		
	}
}
class T2 extends Thread{
	table a;
	T2(table a){
		this.a=a;
	}
	public 
	  void run() {
		a.Printtable(11);
		
	}
}
public class TO {

	public static void main(String[] args) {
		table b1=new table();
		T1 b=new T1(b1);
		T2 b2=new T2(b1);
		b.start();
		b2.start();
		

	}

}

