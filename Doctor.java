package July_19;

public class Doctor extends Person implements Treatable {
	static int doctorCounter = 201;
	final int doctorId;
	String specialization;
	
	
	//public Doctor() {
	//}


	public Doctor(String name, int age, String specialization) {
	    super(name, age);
	    this.specialization = specialization;
	    this.doctorId = doctorCounter++;
	}
	
	public int getDoctorId() {
		return doctorId;
	}
	public String getSpecialization() {
		return specialization;
	}
	
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	public void showDetails() {
		System.out.println(this.toString());
	}
	
	
	public void treatPatient(String patientName) {
		System.out.println("Dr. "+ name + " is treating " + patientName);
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", specialization=" + specialization + ", name=" + name + ", age=" + age
				+ "]";
	}

	
}
