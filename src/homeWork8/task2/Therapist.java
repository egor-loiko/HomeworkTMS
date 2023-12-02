package homeWork8.task2;

public class Therapist extends Doctor {

    private String therapistSkill;

    public Therapist(String name, String speciality, String therapistSkill) {
        super(name, speciality);
        this.therapistSkill = therapistSkill;
    }

    @Override
    public void cure(Patient patient) {
        System.out.println("Cure patient " + patient.getName() + " as Therapist");
    }

    public String getTherapistSkill() {
        return therapistSkill;
    }

    public void setTherapistSkill(String therapistSkill) {
        this.therapistSkill = therapistSkill;
    }
}
