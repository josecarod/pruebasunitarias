package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager driversManager = new DriversManager();
	
	@Test
	void isAddPassanger() {
		Passenger passenger1 = new Passenger("Carlos Eduardo", "ABC123");
		driversManager.addPassenger(passenger1);
		assertEquals(passenger1, driversManager.getPassenger("ABC123"));	
		
	}
	
	@Test
	void idAddDriver() {
		Driver driver1 = new Driver("Jose", "301983", 13);
		driversManager.addDriver(driver1);
		assertEquals(driver1, driversManager.getDriver("301983"));
	}

}
