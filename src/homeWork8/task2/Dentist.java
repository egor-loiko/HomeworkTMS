package homeWork8.task2;

public class Dentist extends Doctor {

    private String dentistSkill;

    public Dentist(String name, String speciality, String dentistSkill) {
        super(name, speciality);
        this.dentistSkill = dentistSkill;
    }

    @Override
    public void cure(Patient patient) {
        System.out.println("Cure patient " + patient.getName() + " as Dentist!");
    }

    public String getDentistSkill() {
        return dentistSkill;
    }

    public void setDentistSkill(String dentistSkill) {
        this.dentistSkill = dentistSkill;
    }
}
