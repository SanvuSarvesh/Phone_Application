public class Main {
    public static void main(String[] args) {
        LandLine l1 = new LandLine("9631245780");
        LandLine l2 = new LandLine("8540364514");

        l1.callANumber("8540854514");
        l2.receiveCall("8540364514");
        System.out.println(l1.answerCall());
    }
}