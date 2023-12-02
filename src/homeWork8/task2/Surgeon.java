package homeWork8.task2;

public class Surgeon extends Doctor {

    private String surgeonSkill;

    public Surgeon(String name, String speciality, String surgeonSkill) {
        super(name, speciality);
        this.surgeonSkill = surgeonSkill;
    }

    @Override
    public void cure(Patient patient) {
        System.out.println("Cure patient " + patient.getName() + " as surgeon!!");
    }

    public String getSurgeonSkill() {
        return surgeonSkill;
    }

    public void setSurgeonSkill(String surgeonSkill) {
        this.surgeonSkill = surgeonSkill;
    }
}
