public class ObjectTraining {
	

	// attributs

	private String name;
	private int age;
	private boolean wilder;

    	// constructeurs
    
    	public ObjectTraining (String name, int age) 
	{
		this.name = name;
		this.age = age;   
    	}

    
	 // getters et setters

	public String getName() 
	{
		return this.name;
	 }

	public void setName(String name) 
	{
        	this.name = name;
    	}
    
   	public int getAge() 
	{
       	 	return this.age;
    	}
    
	public void setAge(int age) 
	{
        	this.age = age;
 	}

	public boolean isWilder() 
	{
		return this.wilder;
	}
    
	public void setWilder(boolean wilder) 
	{
        	this.wilder = wilder;
    	}

	public String whoAmI()
	{
		return ("My name is " +this.getName()+ " and I'm " +this.getAge());
	}

    public ObjectTraining() {
    }
}
