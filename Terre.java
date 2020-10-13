
public class Terre{
	int age=0;
	int population=0;
	static boolean verou = false;
    
    private Terre(int age, int population){
    	this.age=age;
    	this.population=population;	
    }
     
    
    private static Terre INSTANCE = null;
    
    public static Terre getInstance(int age, int population)
    {           
        if (INSTANCE == null) {
        	if (verou == false){
        		verou = true;
        		INSTANCE = new Terre(age,population); 
        	}
        	return INSTANCE;
        	
        }
        
        return INSTANCE;
    }
    
    
	
}
