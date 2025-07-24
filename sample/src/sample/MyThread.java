package sample;

class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("ranjith loves rithika"+i);
			try {
				Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	}
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		System.out.println("main thread is finished");
	}

}
