package JavaPrograms.inheritance;

public class MethodOverridingConcept {
public static void main(String[] args) {
		
		Dog object = new Dog(); 
		object.eat(); 
		//object.name = "Apple";
		object.display();
		System.out.println(object.add(4,5));
		 
		Animal obj = object;
		
		//obj.display(); //child class
		
		System.out.println(obj.add(8,1));
		
		  Animal obj1 = new Animal();
		  obj1.eat();
		  
		  obj1.animalName = "hello";
		  System.out.println(obj1.animalName);
		  
		 
	}
}
