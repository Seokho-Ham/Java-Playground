public class SwitchMain {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        Week today = Week.MONDAY;

        switch (time) {
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("지각");
            case 10:
                System.out.println("하하하");
            case 11:
                System.out.println("ghghgh");
            default:
                System.out.println("ㅎ로ㅓ러러러러");
        }
    }
}
