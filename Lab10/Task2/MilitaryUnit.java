
public abstract class MilitaryUnit implements Cloneable {// Абстрактний клас, що представляє військовий відділ
    abstract String getUnitType();
    abstract String getDescription();

    @Override
    protected Object clone() throws CloneNotSupportedException {
           return super.clone();
           }

}