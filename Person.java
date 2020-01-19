public class Person
{
  String name;
  String adress;
Person(){
  System.out.println("empty");
}
Person(String firstname,String lastname){
  System.out.println("firstname-"+firstname+" lastname-"+lastname);
  this.name= name;
}
Person(String firstname ,String lastname ,String adress){
System.out.println("firstname-"+firstname+" lastname-"+lastname+" adress-"+adress);
}

public static void main(String []args){
  Person Mypersonp1 = new Person();
  Person Mypersonp2 = new Person("maha", "lakshmi");
  Person Mypersonp3 = new Person("maha", "lakshmi","bloominton");
}
}
