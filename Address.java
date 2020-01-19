public class Address{

    private String streetAddress;
    private String aptOrHouseNumber;
    private String zipCode;
    private String cityName;
    private String country;


    Address(String streetAddress, String aptOrHouseNumber,
    String zipCode, String cityName, String country){
            this.streetAddress   =streetAddress;
            this.aptOrHouseNumber=aptOrHouseNumber;
            this.zipCode         =zipCode;
            this.cityName        =cityName;
            this.country         =country;
    }

  public String getStreetAddress(){
    return this.streetAddress;
  }
  public String getAptOrHouseNumber(){
    return this.aptOrHouseNumber;
  }
  public String getZipCode(){
    return this.zipCode;
  }
  public String getCityName(){
    return this.cityName;
  }
  public String getCountry(){
    return this.country;
  }
}
