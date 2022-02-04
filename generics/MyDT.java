package generics;

public class MyDT<T> {
    private Object object;
    private T t;
    public MyDT(){
        super();
    }
    public MyDT(Object object){
        super();
        this.object = object;
    }
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
    @Override
    public String toString() {
        return "MyDt [object= " + object + " ,getObject()=" + getObject() + ", getClass()= " + getClass() + ", hashCode()" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
