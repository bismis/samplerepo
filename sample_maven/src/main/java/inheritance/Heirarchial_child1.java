package inheritance;

public class Heirarchial_child1 extends Heirarchial_parent {
	
	public void show()
	{
		System.out.println("ist child class");
	}

	public static void main(String[] args) {
		
		Heirarchial_child1 obj = new Heirarchial_child1();
		obj.display();
		obj.show();

	}

}
