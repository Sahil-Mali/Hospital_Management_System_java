package July_19;

public class Patient extends Person {
	static int patientCounter = 1001;
	final int patientId;
	String illness;
	
	
	public Patient(String name, int age, String illness) {
		super(name, age);
		this.illness = illness;
		this.patientId = patientCounter++;
	}
	
	
	public int getPatientId() {
		return patientId;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	
	public void showDetails() {
		System.out.println(this.toString());
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", illness=" + illness + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
