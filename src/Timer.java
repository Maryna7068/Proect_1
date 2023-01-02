public class Timer {
    public static void timer(int sec) {
        System.out.println("ostalos " + sec + " sec");
        if (sec < 3600) {
            System.out.println("ostalos menshe chasa");
        } else {
            System.out.println("ostalos " + (sec / 60 / 60) + " hours");
        }
    }

    public static void main(String[] args) {
        Timer.timer(3600);


    }
}
