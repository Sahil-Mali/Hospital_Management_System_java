package July_19;
import java.util.Scanner;

public class HospitalMgmtSystem {
	static final int MAX = 10; 
    static Doctor[] doctors = new Doctor[MAX];
    static Patient[] patients = new Patient[MAX];
    static Appointment[] appointments = new Appointment[MAX];

    static int docCount = 0, patCount = 0, appCount = 0;
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("\n--------HOSPITAL MANAGEMENT SYSTEM--------");
			System.out.println("1. Add Doctor");
			System.out.println("2. Add Patient");
			System.out.println("3. Show all Doctors");
			System.out.println("4. Show all Patients");
			System.out.println("5. Book Appointment");
			System.out.println("6. Show Appointment");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");
            choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					addDoctor();
					break;
				case 2 :
					addPatient();
					break;
				case 3 :
					showDoctors();
					break;
				case 4 :
					showPatients();
					break;
				case 5 :
					bookAppointment();
					break;
				case 6 :
					showAppointments();
					break;
				case 7 :
					System.out.println("Exiting...");
					break;
				default :
					System.out.println("Invalid option.");
			}
		}while(choice!=7);
	}
    
     static void addDoctor() {
    	if (docCount >= MAX) {
    		System.out.println("Doctor list full");
    		return;
    	}
    	sc.nextLine();
    	System.out.println("Enter Doctor Name: ");
    	String name = sc.nextLine();
    	System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();
        
        doctors[docCount++] = new Doctor(name, age, specialization);
        System.out.println("Doctor added");
    }
    
    static void addPatient() {
        if (patCount >= MAX) {
            System.out.println("Patient list full!");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Illness: ");
        String illness = sc.nextLine();

        patients[patCount++] = new Patient(name, age, illness);
        System.out.println("Patient added.");
    }
    
    static void showDoctors() {
        if (docCount == 0) {
            System.out.println("No doctors found.");
            return;
        }
        for (int i = 0; i < docCount; i++) {
            doctors[i].showDetails();
        }
    }
    
    static void showPatients() {
        if (patCount == 0) {
            System.out.println("No patients found.");
            return;
        }
        for (int i = 0; i < patCount; i++) {
            patients[i].showDetails();
        }
    }
    
    static void bookAppointment() {
        if (docCount == 0 || patCount == 0) {
            System.out.println("Add at least 1 doctor and 1 patient first.");
            return;
        }

        System.out.println("Enter Patient ID: ");
        int pid = sc.nextInt();
        System.out.println("Enter Doctor ID: ");
        int did = sc.nextInt();

        Patient selectedPatient = null;
        Doctor selectedDoctor = null;

        for (int i = 0; i < patCount; i++) {
            if (patients[i].getPatientId() == pid) {
                selectedPatient = patients[i];
                break;
            }
        }

        for (int i = 0; i < docCount; i++) {
            if (doctors[i].getDoctorId() == did) {
                selectedDoctor = doctors[i];
                break;
            }
        }

        if (selectedPatient != null && selectedDoctor != null) {
            if (appCount < MAX) {
                appointments[appCount++] = new Appointment(selectedPatient, selectedDoctor);
                System.out.println("Appointment booked!");
            } else {
                System.out.println("Appointment list full.");
            }
        } else {
            System.out.println("Invalid patient or doctor ID.");
        }
    }

    static void showAppointments() {
        if (appCount == 0) {
            System.out.println("No appointments found.");
            return;
        }
        for (int i = 0; i < appCount; i++) {
            appointments[i].showDetails();
        }
    }


}
