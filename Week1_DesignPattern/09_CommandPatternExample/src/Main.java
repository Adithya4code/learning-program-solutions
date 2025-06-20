public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command turnOnLivingRoomLightCommand = new LightOnCommand(livingRoomLight);
        Command turnOffLivingRoomLightCommand = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnLivingRoomLightCommand);
        remote.pressButton();

        remote.setCommand(turnOffLivingRoomLightCommand);
        remote.pressButton();
    }
}