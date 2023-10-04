package homeWork8.task2;

public class Demo {
    public static void main(String[] args) {
        TreatmentPlan treatmentPlan = new TreatmentPlan(3);

        Patient patient = new Patient("Petya", treatmentPlan);
        patient.assignDoctor();

        treatmentPlan.setCode(2);
        patient.assignDoctor();

        treatmentPlan.setCode(1);
        patient.assignDoctor();
    }
}
