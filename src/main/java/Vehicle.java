import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "Vehicle")
//public class Vehicle {
//	@Id
//	@GeneratedValue
//	private int vehicleId;
//	private String vehicleName;
//
//	public Vehicle(int vehicleId, String vehicleName) {
//		this.vehicleId = vehicleId;
//		this.vehicleName = vehicleName;
//	}
//
//	public Vehicle() {
//	}
//
//	public Vehicle(String vehicleName) {
//		this.vehicleName = vehicleName;
//	}
//
//	public int getVehicleId() {
//		return vehicleId;
//	}
//
//	public void setVehicleId(int vehicleId) {
//		this.vehicleId = vehicleId;
//	}
//
//	public String getVehicleName() {
//		return vehicleName;
//	}
//
//	public void setVehicleName(String vehicleName) {
//		this.vehicleName = vehicleName;
//	}
//}
