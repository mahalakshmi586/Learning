public class Adress {
private String streetName;
private String floorNumber;
private String cityName;
private String country;

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
