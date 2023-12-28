public class Monostate {
    private static String sharedState;

    public void setSharedState(String state) {
        sharedState = state;
    }

    public String getSharedState() {
        return sharedState;
    }
}
