package inheritance;

public class Heirarchial_child2 extends Heirarchial_parent{
	
	public void view()
	{
		System.out.println("2nd child class");
	}

	public static void main(String[] args) {
		
		
		Heirarchial_child2 obj = new Heirarchial_child2();
		obj.display();
		obj.view();
	}

}

//All child classes share the same parent but do NOT inherit from each other.