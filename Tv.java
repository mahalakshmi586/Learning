public class Tv{
  private String type;
  private String inches;
  private String brand;
  private String shape;

   Tv(String type , String inches , String brand , String shape){
     this.type = type;
     this.inches = inches;
     this.brand = brand;
     this.shape = shape;
   }

    public String getType(){
    return this.type;
  }
  public String getInches(){
  return this.inches;
}
public String getBrand(){
return this.brand;
}
public String getShape(){
  return this.shape;
}
}
