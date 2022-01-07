package goodSOLID.goodSolidPrinciplesApp;

//OCP
//LSP
public class Notifications implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        if(medium.equals("email")){
            System.out.println("notifications sent to email");
        }
        if(medium.equals("phone")){
            System.out.println("notifications sent to phone number");
        }
    }

    @Override
    public void sendUpdates(String medium) {
        System.out.println("Updates will be sent to "+ medium);
    }
}
