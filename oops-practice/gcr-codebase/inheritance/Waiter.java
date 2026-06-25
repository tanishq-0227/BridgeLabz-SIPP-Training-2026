public class Waiter extends PersonRest implements Worker {
    private String section;

    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + getName() + " is serving customers in " + section + " section");
    }

    public String getSection() {
        return section;
    }
}
