public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        SimpleRemoteControl control = new SimpleRemoteControl();
        LightOnCommand onCommand = new LightOnCommand(light);
        control.setSlot(onCommand);
        control.buttonPressed();


    }
}
