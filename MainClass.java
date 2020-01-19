public class MainClass{

  public static void main(String[] args){
    Address address = new Address("707 Arcadia Drive",
    "#4", "61704", "bloomington", "USA");
    Student student = new Student("Swapna", "Deshmukh", address);
    System.out.println("First Name " + student.getFirstName());
    System.out.println("Last Name " + student.getLastName());
    Address studentAddress = student.getAddress();
    System.out.println("Address " + studentAddress.getStreetAddress()
    +" "+ studentAddress.getAptOrHouseNumber()+" "
    +" "+ studentAddress.getZipCode()
    +" "+ studentAddress.getCityName()
    +" "+ studentAddress.getCountry());
  }
}
