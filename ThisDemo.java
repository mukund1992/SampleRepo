class Person{
String name;
int age;
//
Person(){
//System.out.println("We are in default constructor");
//this("niit",24);
}
public Person(String name, int age){
this();
System.out.println("We are in param constructor");
	this.name = name;
	this.age = age;
}
}
public class ThisDemo{
	public static void main(String args[]){
		Person per = new Person("abc",11);
	}
}