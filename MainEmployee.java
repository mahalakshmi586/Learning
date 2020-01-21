public class MainEmployee{
public static void main(String[]args){
  Company company = new Company(" capgemini ", 11 ,
  "adress");
  Employee employee = new Employee(" maha "," lakshmi " ,
   1 , company);
//Company employeeCompany = employee.getCompany();
 System.out.println("First Name" +
 employee.getFirstName());
System.out.println("Last Name" + employee.getLastName());
System.out.println("Id" + employee.getId());
System.out.println("Company" + employeeCompany.getCompanyName()
+" " + employeeCompany.getCompanyId()
+" " + employeeCompany.getAdress());
}
}
