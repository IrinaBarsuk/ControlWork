package org.itstep.ControlWork1901;

class Shopping extends Tour {

    public Shopping(String nameOfTour, double costOfTransport, int nutrition, int numberOfDays) {
        super(nameOfTour, costOfTransport, nutrition, numberOfDays);
    }

    @Override
    public String toString() {
        String result = String.format("Tour name: %s, transport cost : %.2f, nutrition: %d, " +
                "number of days: %d%n", getNameOfTour(), getCostOfTransport(), getNutrition(), getNumberOfDays());
        return result;
    }
}
