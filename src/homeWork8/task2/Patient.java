package homeWork8.task2;

public class Patient {
    private String name;

    private TreatmentPlan treatmentPlan;

    public Patient(String name) {
        this.name = name;
    }

    private void assignDoctor() {
        switch (treatmentPlan.getCode()) {
            case 1:
                new Surgeon("Vasya", "sur", "Highest").cure(this);
                break;
            case 2:
                new Dentist("Jora", "dent", "hight").cure(this);
                break;
            default:
                new Therapist("Olga", "ther", "1st category").cure(this);
        }
    }

    public void assignTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
        assignDoctor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
