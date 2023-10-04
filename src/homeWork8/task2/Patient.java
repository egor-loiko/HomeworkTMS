package homeWork8.task2;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public void assignDoctor() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
