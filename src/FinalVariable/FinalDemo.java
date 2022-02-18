package FinalVariable;

public class FinalDemo {
	
	    // create a final method
	    public final void display() {
	      System.out.println("This is a final method.");
	    }
	}

	class Main extends FinalDemo {
	  // try to override final method
	  public final void display() {
	    System.out.println("The final method is overridden.");
	  }

	  public static void main(String[] args) {
	    Main obj = new Main();
	    obj.display();
	  }
	}

