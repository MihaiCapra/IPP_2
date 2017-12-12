package adapter;

public class Main {
    public static void main(String[] args){
        // The driver can drive only cars but with this adapter he can drive a Truck
        Door door = new Door(new BoxAdapter());
        door.dropPackage();
    }
}
