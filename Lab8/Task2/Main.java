public class Main {
    public static void main(String[] args) {
        Monostate firstInstance = new Monostate();
        firstInstance.setSharedState("Monostate");
        System.out.println("First Instance State: " + firstInstance.getSharedState());

        Monostate secondInstance = new Monostate();
        System.out.println("Second Instance State: " + secondInstance.getSharedState());

        DerivedMonostate derivedInstance = new DerivedMonostate();
        System.out.println("Derived Instance State: " + derivedInstance.getSharedState());
    }
}