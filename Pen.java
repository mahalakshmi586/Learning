public class Pen{
  private String brand;
  private String colour;
  private String usage;
  private String type;

   Pen(String brand , String colour, String usage , String type){
   this.brand = brand;
   this.colour = colour;
   this.usage = usage;
   this.type = type;
   }
   public String getBrand(){
     return this.brand;
   }
     public String getColour(){
       return this.colour;
     }
       public String getUsage(){
         return this.usage;
       }
         public String getType(){
           return this.type;

         }
       }
