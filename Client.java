public class Client {
	
	static int mutex=0;
	
public static Terre cree(int age, int population) {
		
		Terre terre = Terre.getInstance(age, population);
		return terre;
		
}
public static String show(Terre earth) {
	String terre="l'age de la terre est : "+earth.age + " et sa population est : "+earth.population+"\n";
	return terre;
}

public static Terre modifier(Terre earth, int age, int population) {
	
	earth.age= age;
	earth.population=population;
	return earth;
	
}
	
	public static void main(String[] args) {
		
		
		
		Terre earth = cree(25,1000);
		Terre earth1 = cree(30,1000);
		
		System.out.print(show(earth));
		System.out.print(show(earth1));
		
		Terre earth3 = modifier(earth,50,6000);
		System.out.print("les attributs de la terre après modification devient:"+show(earth3));
		Terre earth4 = cree(40,2000);
		System.out.print(show(earth4));
		
		
	}

}
