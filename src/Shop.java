public class Shop {


    static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen == true || isReweOpen == true) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Я могу купить еду, это " + ((Shop.canBuy(true,false)) ? "правда" : "неправда"));

    }

}
