/*

Name: Michael Unterhuber
Email: 01609582@edu.campus02.at
Matrikel-Number: 01609582


 */


public class BMICalculator {

    private final String firstname;
    private final String lastname;
    private final char gender;
    private int bodyHeight;
    private double bodyWeight;

    public BMICalculator(String firstname, String lastname, char gender, int bodyHeight, double bodyWeight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getGender() {
        return gender;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    private double round(double value) {
        return Math.round(value * 100) / 100D;
    }

    public double calculateBMI() {
        return bodyWeight / (((double)bodyHeight / 100) * ((double)bodyHeight / 100));
    }

    public int calculateBMICategory() {
        double bmi = calculateBMI();

        if (gender == 'm') {
            if (bmi < 16.0)
                return -2;
            else if (bmi < 18.5)
                return -1;
            else if (bmi < 25)
                return 0;
            else if (bmi < 35)
                return 1;
            else
                return 2;
        } else {
            if (bmi < 15.0)
                return -2;
            else if (bmi < 17.5)
                return -1;
            else if (bmi < 24)
                return 0;
            else if (bmi < 34)
                return 1;
            else
                return 2;
        }
    }

    public String getBMICategoryName() {
        int category = calculateBMICategory();
        switch (category){
            case -2:
                return "Sehr starkes Untergewicht";
            case -1:
                return "Untergewicht";
            case 0:
                return "Normalgewicht";
            case 1:
                return "Übergewicht";
            case 2:
                return "Sehr starkes Übergewicht";
            default:
                throw new IllegalArgumentException("Invalid bmi category");
        }
    }

}
