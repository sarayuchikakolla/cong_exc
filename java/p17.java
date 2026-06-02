class p17 {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        p17 car1 = new p17();

        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;

        car1.displayDetails();
    }
}