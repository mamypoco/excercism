public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate;
        if (speed > 9) {
            rate = 0.77;
        } else if (speed > 8) {
            rate = 0.80;
        } else if (speed > 4) {
            rate = 0.90;
        } else 
            rate = 1.00; 
        return speed * 221 * rate;
    }

    public int workingItemsPerMinute(int speed) {
        double productionPerHour = productionRatePerHour(speed);
        return (int) productionPerHour / 60;
    }
}
