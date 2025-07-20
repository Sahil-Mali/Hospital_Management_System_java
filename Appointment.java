package July_19;

public class Appointment {
	final Patient patient;
	final Doctor doctor;
	
	
	
	public Appointment(Patient patient, Doctor doctor) {
		super();
		this.patient = patient;
		this.doctor = doctor;
	}
	
	public void showDetails() {
		System.out.println("Appointment: " + patient.getName() + " with Dr. " + doctor.getName());
		doctor.treatPatient(patient.getName());
	}

	@Override
	public String toString() {
		return "Appointment [patient=" + patient.getName() + ", doctor=" + doctor.getName() + "]";
	}
	
	

}
