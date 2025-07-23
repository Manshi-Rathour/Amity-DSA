package Oops;

public class AppV2 extends AppV1{
    public void videoCall(){
        System.out.println("Video Call is now possible!");
    }
    public void story(){
        System.out.println("You can upload story as well!");
    }

    @Override
    public void seen(){
        System.out.println("Updated seen feature!");
    }
}
