public class Chef extends PersonRest implements Worker {
    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + getName() + " is preparing food. Specialization: " + specialization);
    }

    public String getSpecialization() {
        return specialization;
    }
}
