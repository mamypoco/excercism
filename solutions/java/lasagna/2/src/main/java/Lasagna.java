public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int min) {
        return expectedMinutesInOven() - min;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }  
    // minutesInOven is what you will insert manually when calling, not from above
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + minutesInOven;
    }
}


