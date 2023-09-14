class Producer extends Thread {
	public void run() {
	    setrandom();
	    }
	    public double setrandom(){
	        double max = 100;
	        double min = -100;
	        double res = Math.random() * (max - min + 1) + min;
	        return res;
	    }
}

class Consumer extends Producer {
	public void run() {
        double v = super.setrandom();
        if(v>0) {
            System.out.println(v+" Positive");
        }
        else {
            System.out.println(v+" Negative");
        }
    }    
}

public class MultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer t1 = new Producer();
        t1.start();
        Consumer t2 = new Consumer();
        t2.start();
	}

}
