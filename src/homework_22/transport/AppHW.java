package homework_22.transport;

public class AppHW {
    public static void main(String[] args) {

        CarHW car = new CarHW();
        car.startEngine();
        MotorcycleHW motorcycle = new MotorcycleHW();
        motorcycle.startEngine();
        BicycleHW bicycle = new BicycleHW();
        bicycle.startEngine();

        System.out.println("========================");
        VechikleHW vechikle1 = new CarHW();
        VechikleHW vechikle2 = new MotorcycleHW();
        VechikleHW vechikle3 = new BicycleHW();
        VechikleHW[] vechikle = new VechikleHW[3];
        vechikle[0] = vechikle1;
        vechikle[1] = vechikle2;
        vechikle[2] = vechikle3;

        for (int i =0; i < vechikle.length; i++){
            vechikle[i].startEngine();
            System.out.println(vechikle[i]);
        }
    }
}
