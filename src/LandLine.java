public class LandLine implements Phone_Application {

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void isPowerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callANumber(String phoneNo) {
        if(isPowerOn){
            if(phoneNo.length()<10 || (phoneNo.charAt(0)>=0 && phoneNo.charAt(0)<=5)){
                System.out.println("Invalid Number, Kindly Re-enter your valid number..");
            }
            else{
                System.out.println("You are calling to "+phoneNo);
            }

        }
        else{
            System.out.println("Opps, Device is Off...");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println(phoneNo+" is Calling you..");
        }
        else{
            System.out.println("Receiver's Device is Off, Kindly try after Sometime...");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("Call Received...");
            this.isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
