package generics;

public class MyDT<T> {
    private Object object;
    private T t;
    public MyDT(){
        super();
    }
    public MyDT(T t){
        super();
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    @Override
    public String toString() {
        return "MyDt [object= " + object + " ,getObject()=" + getT() + ", getClass()= " + getClass() + ", hashCode()" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
