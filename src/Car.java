public class Car {
    private String model;
    private int power;
    private double volume;
    private boolean turbo;

    public Car(String model, int power, double volume, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volume = volume;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String startEngine() {
        return model + "do vrum-vrum";  //по прикалдесу добавив
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", turbo=" + (turbo?"yes":"no") +
                '}';
    }
}
