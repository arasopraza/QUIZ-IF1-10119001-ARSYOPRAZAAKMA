public class ServicePrice implements ServiceItem {
    private float priceService, discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public void displayService() {
        System.out.println("#***************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#******Service List******#");
        System.out.println("1.Haircut : IDR 45K");
        System.out.println("2.Haircut + Hairwash : IDR 55K");
        System.out.println("3.Hairwash Only : IDR 15K");
        System.out.println("#***************************#");

    }

    @Override
    public float getPrice(int serviceItem) {
        if (serviceItem == 1) {
            serviceItem = 45000;
        } else if (serviceItem == 2) {
            serviceItem = 55000;
        } else {
            serviceItem = 15000;
        }
        return serviceItem;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if (statusMember == "YES") {
            return true;
        }
        return false;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if (isMember){
            parServicePrice = 10/100 * getPriceService();
        }
        return 0;
    }

    public float getTotalPay(float priceService, float discount) {
        return getPriceService() - discount;
    }
}
