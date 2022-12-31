public class Walk {

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

        boolean isWeekend = false;
        boolean isRain = false;
        boolean canWalk = (isWeekend == true && isRain == false) ? true : false;
        System.out.println("Я могу купить еду, это " + ((Walk.canBuy())?"правда":"неправда"));

//        boolean canWalk;
//        if (isWeekend == true && isRain == false) {
//            canWalk = true;
//        } else {
//            canWalk = false;
//        }
    }

}
