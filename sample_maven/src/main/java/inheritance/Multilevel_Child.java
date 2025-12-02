package inheritance;

public class Multilevel_Child extends IntermediateParent {
	
	public void print()
	{
		System.out.println("child class of parent1 and parent2");
	}

	public static void main(String[] args) {
		
		Multilevel_Child obj = new Multilevel_Child();
		obj.display();
		obj.show();
		obj.print();
		
		
		

	}

}
