package goodSOLID.goodSolidPrinciplesApp;

//OCP
//ISP
public class InstagramNotifications implements NotificationService,NotificationForAds{
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

    //OCP
    @Override
    public void sendAds() {
        System.out.println("Ads will be shown to your instagram");
    }
}
