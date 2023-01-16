public interface Phone_Application {
    void isPowerOn();
    void callANumber(String callingNumber);
    void receiveCall(String receivingNumber);
    boolean answerCall();
    boolean isRinging();
}
