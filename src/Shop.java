public class Shop {
    static boolean isEdekaOpen = true;
    static boolean isReweOpen = true;

    static boolean canBuy() {
        if (isEdekaOpen == true || isReweOpen == true) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Я могу купить еду, это " + ((Shop.canBuy())?"правда":"неправда"));

    }

}
