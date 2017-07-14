public class overloaded_constructors{
	private String name;
	private int age;

	public overloaded_constructors(){
		this("Reza",33);
	}

	public overloaded_constructors(String init_name){
		this(init_name,0);
	}

	public overloaded_constructors(String init_name, int init_age){
		name = init_name;
		age = init_age;
	}

	public void show(){
		System.out.println(name);
		System.out.println(age);
	}

}
