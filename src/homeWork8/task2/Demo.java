package homeWork8.task2;

public class Demo {
    public static void main(String[] args) {
        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        TreatmentPlan treatmentPlan2 = new TreatmentPlan(2);
        TreatmentPlan treatmentPlan3 = new TreatmentPlan(3);

        Patient patient = new Patient("Petya");

        patient.assignTreatmentPlan(treatmentPlan1);
        patient.assignTreatmentPlan(treatmentPlan2);
        patient.assignTreatmentPlan(treatmentPlan3);
    }
}
