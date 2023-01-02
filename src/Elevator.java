public class Elevator {

    public static int elevator(int h, int n, int m){
        int floor = 0;
        int counter = 0;
        while (floor < h){
            floor = floor + n - m;
            counter = counter+1;

        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(elevator(200, 50, 1));
    }

}
