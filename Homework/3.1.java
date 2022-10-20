class Fahr {
    public static void main(String[] args) {
        double fahr = 0, celsius;
        System.out.println("Fahr Celsius");
        while(fahr <= 80){
            celsius = (fahr - 32) * 5.0 / 9;
            System.out.printf("%3.0f  %6.1f\n",fahr,celsius);
            fahr += 20;
        }
    }
}