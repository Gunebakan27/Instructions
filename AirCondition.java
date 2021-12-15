package day25interface;
/*
 * 1)Interface is not a class. Interface is Interface.
 * 2)We need interface to be able to create "multiple interface parents" for a class
 * 3)All methods must be "abstract" in interface. Because of that "interfaces" are use for "fully abstraction" 
 * Not: We can use "abstract" and "concrete" methods together in "abstract classes". Because of that using "abstract class" is called
 * 	"partial abstraction"
 * 4)Do not use "abstract" keyword when you create interface. Because Java knows interfaces are abstract.
 * 5)All methods are abstract as default in an interface, because of that using "abstract" keyword is optional.
 * I mean "public abstract void electronicAc();" are "public void electronicAc();" completely same for Java
 * 6)All methods are "public" as default in an interface. Because of that using access modifier is optional for methods in an interface.
 * I mean "public void electronicAc();" and "void electronicAc();" completely same for Java
 * 7)If you make an "interface" parent of a class, do not use "extends" use "implements"
 * 8)In different parent interfaces you can use methods with the same name. But be careful about return types. If the method names are same,
 * you cannot use different return types.
 * 9)All variables in an interface are "public", "static(class variable"", "final" as default.
 * Note!: You cannot create object by using "interfaces" because, interfaces are "fully abstract" and they do not have "constructors".
 * Noe2: "abstract class" have "constructors" but the constructors are not used to create objects. We cannot create objects from abstract classes.
 * 10)Java knows all variables in an interface are "public static final". Because of that declaring them for variables is optional.
 * 11)In different parent interfaces, you can create variables with the same name, it will not be problem because every time,
 * when you call a variable, you have to use interface name.
 * 12)It is not must to override the methods from interfaces, it is optional, if you want you can override.
 * 13)After overriding an abstract method in any parent, it will not be abstract anymore for child classes.
 * 14)Concrete class must override all abstract methods from all parents, otherwise you will get CTE.
 * Note: If any abstract method is overridden by any parent class, it will not be must to override it by concrete child class.
 * 15)
 * 	Concrete Class-->Interface: implements
 * 	Abstract Class-->Interface: implements
 * 	
 *	***interface-->Concrete Class: This is not allowed in Java, class cannot be parent of an interface
 * 	***interface-->Abstract Class: This is not allowed in Java, class cannot be parent of an interface
 * 	Interface-->interface : extends
 * 	Concrete Class--> Concrete Class: extends
 * 	Abstract Class-->Concrete Class: extends
 * 	Concrete Class-->Abstract Class: extends
 * 	Abstract Class-->Abstract Class: extends
 * 
 * 
 * 
 */

public interface AirCondition extends Vehicle {
	String MAKE="Samsung";
	
	public abstract void electronicAc();
	
	public void climateAc();
	
	void bacteriaKiller();
	
	void run();
	
	
	

}
