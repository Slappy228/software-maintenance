public class Infantry extends MilitaryUnit {// Клас для представлення піхоти
    @Override
    String getUnitType() {
        return "Піхота";
    }

    @Override
    String getDescription() {
        return "Звичайні піхотинці, що служать на землі.";
    }
}
