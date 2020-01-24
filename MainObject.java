public class MainObject{
  public static void main(String[] args){
    Car car = new Car(" Mustang " , " Black " ," Medium " , " Sports ");
    Tv tv = new Tv(" Smart " , " 62 " ," Samsung " , " Curve ");
    Pen pen = new Pen(" Fountain " , " Blue " ," Writing " , " BallPoint ");
    Dog dog = new Dog(" Laborador " , " Brown " ," Female " , " 2 ");
    Watch watch = new Watch(" Apple " , " Men " ," Leather " , " Digital " ,
    " SmartWatch ");

    System.out.println("model" + car.getModel());
    System.out.println("colour" + car.getColour());
    System.out.println("end" + car.getEnd());
    System.out.println("type" + car.getType());

    System.out.println("type" + tv.getType());
    System.out.println("inches" + tv.getInches());
    System.out.println("brand" + tv.getBrand());
    System.out.println("shape" + tv.getShape());

    System.out.println("brand" + pen.getBrand());
    System.out.println("colour" + pen.getColour());
    System.out.println("usage" + pen.getUsage());
    System.out.println("type" + pen.getType());

    System.out.println("breed" + dog.getBreed());
    System.out.println("colour" + dog.getColour());
    System.out.println("sex" + dog.getSex());
    System.out.println("age" + dog.getAge());

    System.out.println("brand" + watch.getBrand());
    System.out.println("depart" + watch.getDepart());
    System.out.println("material" + watch.getMaterial());
    System.out.println("display" + watch.getDisplay());
    System.out.println("Feature" + watch.getFeature());

  }
  }
