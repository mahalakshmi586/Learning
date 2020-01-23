public class MainLakshmi{
  public static void main(String[] args){
Father father = new Father(" Krishna " , " Nitla ");
Mother mother = new Mother(" Lakshmi " , " Nitla ");
Husband husband = new Husband(" Narsimharao " , " kota ");
Brother brother = new Brother(" Sudhakar " , " Nitla ");
  Lakshmi lakshmi = new Lakshmi(" maha "," vishnu ", father , mother
  , husband , brother);
Father lakshmiFather = lakshmi.getFather();
Mother lakshmiMother = lakshmi.getMother();
Husband lakshmiHusband = lakshmi.getHusband();
Brother lakshmiBrother = lakshmi.getBrother();
  System.out.println("FirstName" + lakshmi.getFirstName());
  System.out.println("LastName" + lakshmi.getLastName());
//  System.out.println("father" + lakshmi.getFather());
  //System.out.println("mother" + lakshmi.getMother());
//  System.out.println("husband" + lakshmi.getHusband());
  //System.out.println("Brother" + lakshmi.getBrother());
  System.out.println("Father" + lakshmiFather.getFirstName());
  System.out.println("Father" + lakshmiFather.getLastName());
  System.out.println("Mother" + lakshmiMother.getFirstName());
  System.out.println("mother" + lakshmiMother.getLastName());
  System.out.println("Husband" + lakshmiHusband.getFirstName());
  System.out.println("Husband" + lakshmiHusband.getLastName());
  System.out.println("Brother" + lakshmiBrother.getFirstName());
  System.out.println("Brother" + lakshmiBrother.getLastName());
}
}
