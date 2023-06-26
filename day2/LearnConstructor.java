package week7.day2;

public class LearnConstructor {
	
	public LearnConstructor() { 
		System.out.println("I am from default Constructor");
		
	}
	
	public LearnConstructor(String Name) {
		this();
		System.out.println("one parameter :"+Name);
		
	}
	public LearnConstructor(String name  , int id) {
		this("TestLeaf");
		System.out.println("Two parameter constructor "+ name+id);
	}
	int var;
	public static void main(String[] args) {
		
		LearnConstructor obj = new LearnConstructor("TestLeaf",5678);
	

	}

}
