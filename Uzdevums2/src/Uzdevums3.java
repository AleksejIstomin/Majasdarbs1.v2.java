public class Uzdevums3 {

    public static void main(String[] args) {
        int soundDb =111;

        if (soundDb <= 39) {
            System.out.println("Vajs");
        } else if (soundDb >= 40 && soundDb <= 69) {
            System.out.println("Merens");
        } else if (soundDb >= 70 && soundDb <= 99) {
            System.out.println("Skals");
        } else if (soundDb >= 100 && soundDb <= 129) {
            System.out.println("Loti skals");
        } else {
            System.out.println("Sapigi");
        }
    }




}
