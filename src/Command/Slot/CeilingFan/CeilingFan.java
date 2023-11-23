package Command.Slot.CeilingFan;

public class CeilingFan {
    String location = "";

    CeilingFanPower power ;


    public CeilingFan(String location) {
        this.location = location;
    }

    public void mode(){
        switch (power){
            case HIGH -> high();
            case MEDIUM -> medium();
            case LOW -> low();
            case OFF -> off();
        }
    }
    public void high(){
        power = CeilingFanPower.HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium(){
        power = CeilingFanPower.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low(){
        power = CeilingFanPower.LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off(){
        power = CeilingFanPower.OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public CeilingFanPower getPower(){
        return power;
    }
}
