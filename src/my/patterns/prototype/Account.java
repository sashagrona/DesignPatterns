package my.patterns.prototype;

public abstract class Account implements Cloneable {

    public abstract void accountType();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
