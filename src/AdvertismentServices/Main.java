package AdvertismentServices;

public class Main {
    public static void main(String[] args){
        Company company = new Company();

        company.setAdvertiseCompany(new Facebook());
        company.doAdvertise(50);

    }
}
