package homeWork8.task2;

public class Demo {
    public static void main(String[] args) {

        Patient patient = new Patient("Petya");

        TreatmentPlan treatmentPlan = new TreatmentPlan(1);

        patient.assignTreatmentPlan(treatmentPlan);

        //If treatment plan code is changed for patient
        patient.changeTreatmentPlanCode(2);
        patient.changeTreatmentPlanCode(3);
    }
}
