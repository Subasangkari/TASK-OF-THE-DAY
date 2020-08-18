package myTheard;

class Hare implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("Hare is at position"+i);
		try {
			Thread.sleep(100);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		if(i==90) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	}
}
	

class Tortise implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("Tortise is at position"+i);
		try {
			Thread.sleep(200);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	}
}
public class HareTortise{
public static void main(String[] args) {
		// TODO Auto-generated method stub
Tortise tortise= new Tortise();	
Hare hare=new Hare();

Thread t1=new Thread(tortise);
Thread h1=new Thread(hare);

t1.start();
h1.start();

while(true) {
   if(!h1.isAlive()) {
	   System.out.println("Hare wins the race.");
        t1.stop();
        break;
   }
   if(!t1.isAlive()) {
	   System.out.println("Tortise wins the race.");
        h1.stop();
        break;
   }
}
System.out.println("Refree declared that the race is completed.");
}
}