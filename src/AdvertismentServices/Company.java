package AdvertismentServices;


public class Company  {

    private AdvertisementInterface advertiseCompany;


    public void setAdvertiseCompany(AdvertisementInterface advertiseCompany){
        this.advertiseCompany=advertiseCompany;


}
    public void doAdvertise( int budgetForAdvertisement){
        for(int i=0;i<budgetForAdvertisement;i++){
            System.out.println(advertiseCompany.makeAdvertise());
        }

    }


}
