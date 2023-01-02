public class Timer {
    public static void timer(int sec) {
        System.out.println("ostalos "+sec + " sec");
        System.out.println("ostalos "+(sec/60/60)+ " hours");
    }


    public static void main(String[] args) {
        Timer.timer(25000);

        System.out.println(25199/60/60);
    }
}
