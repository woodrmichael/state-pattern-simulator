package state;

public class GearReverse implements Gear {
    @Override
    public Gear nextGear(UserInput ui) {
        return null;
    }

    @Override
    public void resolveBehavior(UserInput ui, Car car) {

    }

    @Override
    public int getGear() {
        return 0;
    }
}