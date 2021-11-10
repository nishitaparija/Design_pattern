class BridgeTV implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    public boolean isEnabled() {
        return on;
    }

    public void enable() {
        on = true;
    }

    public void disable() {
        on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void printStatus() {

    }

    void display() {
        System.out.println("This is the TV Set.");
        System.out.println("I am "+(on ?"Enabled":"Disabled"));
        System.out.println("The volume is "+volume+"%");
        System.out.println("The Channel is "+channel);
    }
}

public class Main {
    public static void main(String[] args) {
        BridgeTV bt = new BridgeTV();
        bt.display();
    }
}