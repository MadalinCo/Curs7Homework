package AdvertismentServices;

public class Facebook implements AdvertisementInterface {
    private int amountToPay = 0;
    private int view =0;
    private int pricePerView= 1;


    public boolean pay(int amount) {
        if(amount>0 && amount<=amountToPay){
            amountToPay -=amount;
            System.out.println("Facebook was payed" + amount);
            return true;
        }
        return false;
    }


    public String makeAdvertise() {
        view++;
        amountToPay +=pricePerView;
        return "person reached";
    }


    public int getReachedPeople() {
        return view;
    }
}

