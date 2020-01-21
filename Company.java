public class Company{

  String companyName;
  int companyId;
  String adress;

  Company(String companyName,int companyId,
  String adress){
    this.companyName = companyName;
    this.companyId = companyId;
    this.adress = adress;
  }
//  adress(String streetName, String floorNumber,
  //String cityName, String country){
    //this.streetName = streetName;
  //  this.floorNumber = floorNumber;
  //  this.cityName = cityName;
  //  this.country = country;

//  }

    public String getCompanyName(){
    return this.companyName;
    }
    public int getCompanyId(){
      return this.companyId;
    }
    public String getAdress(){
      return this.adress;
    }

    class Adress {
      String streetName;
      String floorNumber;
      String cityName;
      String country;

    Adress(String streetName, String floorNumber,
    String cityName, String country){
      this.streetName = streetName;
      this.floorNumber = floorNumber;
      this.cityName = cityName;
      this.country = country;
    }

     public String getStreetName(){
      return this.streetName;
    }
    public String getFloorNumber(){
    return this.floorNumber;
    }
    public String getCityName(){
    return this.cityName;
    }
    public String getCountry(){
    return this.country;
    }
  }
}
