public class gf1{
	private String girlname;
	public String boyname;

	public void setname(String name){
        	girlname = name;
	}

	public String getname(){
		return girlname;
	}
	
	public void saying(){
		System.out.printf("Your gf is %s", getname());
	}

}
