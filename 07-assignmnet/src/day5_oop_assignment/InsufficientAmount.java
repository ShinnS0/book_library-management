package day5_oop_assignment;

public class InsufficientAmount extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InsufficientAmount(String msg) {
		super(msg);
	}

}
