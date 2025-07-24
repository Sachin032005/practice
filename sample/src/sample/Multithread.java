package sample;
class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("ranjith"+i);
			try {
				Thread.sleep(2000);
		}catch(Exception e) {
			System.out.println(e);}}}}
class MyThread2 extends Thread{

	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("rithika"+i);
			try {
				Thread.sleep(7000);
		}catch(Exception e) {
			System.out.println(e);}}}}
public class Multithread {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
		System.out.println("main thread finished");
	}
}
