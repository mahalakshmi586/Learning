public class Puppy{
  String name;
  int age;

public void setName(String name){
  this.name = name;
}

 public void setAge(int age){
   this.age = age;
 }

public String getName(){
  return this.name;
}
public int getAge(){
  return this.age;
}

public static void main (String[] args){
  Puppy p1 = new Puppy();
//  Puppy p2 = new Puppy();
  p1.setName("tommy");
  p1.getName();
  Puppy p2 = new Puppy();

  p2.setAge( 2 );
  p2.getAge();
  System.out.println("Name is : " + p1.getName());
  System.out.println("Age is : " + p2.getAge());
}
}
