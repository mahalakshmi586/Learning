public class MainEmployee{

public static void main(String[] args){
 Adress adress = new Adress(" plaza ", " 8 " ,  " Bloomington ", " usa ");
// Company adress = new Adress(" plaza ", " 8 " ,  " Bloomington ", " usa ");
  Company company = new Company(" capgemini ", 11 ,  adress);
//  Adress adress = new Adress(" plaza ", " 8 " ,  " Bloomington ", " usa ");
  Employee employee = new Employee(" maha "," lakshmi " ,
   1 , company);
  // Adress companyAdress = company.getAdress();
Company employeeCompany = employee.getCompany();
   Adress companyAdress = company.getAdress();
System.out.println("First Name" + employee.getFirstName());
System.out.println("Last Name" + employee.getLastName());
System.out.println("Id" + employee.getId());
System.out.println("Company" + employeeCompany.getCompanyName()
+" " + employeeCompany.getCompanyId()
+" " + employeeCompany.getAdress());
System.out.println("Adress" + companyAdress.getStreetName());
System.out.println("Adress" + companyAdress.getFloorNumber());
System.out.println("Adress" + companyAdress.getCityName());
System.out.println("Adress" + companyAdress.getCountry());
}
}
