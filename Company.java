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

    public String getCompanyName(){
    return this.companyName;
    }
    public int getCompanyId(){
      return this.companyId;
    }
    public String getAdress(){
      return this.adress;
    }
  }
