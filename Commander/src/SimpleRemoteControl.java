public class SimpleRemoteControl  {
    Command slot;

    public void setSlot(Command command){
        slot = command;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
