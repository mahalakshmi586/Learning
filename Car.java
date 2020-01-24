public class Car{
  private String model;
  private String colour;
  private String end;
  private String type;

   Car(String model , String colour, String end , String type){
   this.model = model;
   this.colour = colour;
   this.end = end;
   this.type = type;
   }
   public String getModel(){
     return this.model;
   }
     public String getColour(){
       return this.colour;
     }
       public String getEnd(){
         return this.end;
       }
         public String getType(){
           return this.type;

         }
       }
