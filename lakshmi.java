public class Lakshmi{
private String firstName;
private String lastName;
private Father father;
private  Mother mother;
private  Husband  husband;
private  Brother brother;

Lakshmi(String firstName, String lastName, Father father ,  Mother mother,
Husband husband ,  Brother brother) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.father = father;
  this.mother = mother;
  this.husband = husband;
  this.brother = brother;
}
public String getFirstName(){
  return this.firstName;
}
public String getLastName(){
  return this.lastName;
}
public Father getFather(){
  return this.father;
}
public Mother getMother(){
  return this.mother;
}
public Husband getHusband(){
  return this.husband;
}
public Brother getBrother(){
  return this.brother;
}
}
