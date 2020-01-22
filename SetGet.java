public class SetGet{
   String name;

   public void setName(String name){
   this.name = name;
 }
 public String getName() {
 return this.name;
}
public static void main(String[] args){
SetGet s1 = new SetGet();
s1.setName("maha") ;
s1.getName() ;
  System.out.println( "Name is : " + s1.getName());
}
}
