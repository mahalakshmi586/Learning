public class Student{

  private String firstName;
  private String lastName;
  private int studentId;
  private Address address;


  Student(String firstName, String lastName, Address address){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public Address getAddress(){
    return this.address;
  }

}
