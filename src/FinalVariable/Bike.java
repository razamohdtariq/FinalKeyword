package FinalVariable;

public class Bike {

	final int speedlimit=90;
	void run() {
     speedlimit = 400;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike obj = new Bike ();
obj.run();
	}

}
