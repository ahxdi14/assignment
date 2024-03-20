package Assignment;

	public class CarRBCA22103 extends VehicleRBCA22103 {
	    private String make;

	    public CarRBCA22103 (int horsepower, String make) {
	        super(horsepower);
	        this.make = make;
	    }

	    public void drive() {
	        super.drive();
	        System.out.println("Car is being driven");
	    }

	    public String getMake() {
	        return make;
	    }
	}



