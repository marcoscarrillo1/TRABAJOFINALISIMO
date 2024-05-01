package Bucle;

public class ElementoLe<T> {
    protected ElementoLe<T> siguiente;
    private T data;
    public ElementoLe(){
        siguiente = null;
    }

    protected void insertarmeEn(ElementoLe<T> el) {

        ElementoLe<T> e = new ElementoLe<T>();
        e.setData(el.getData());

    }

    public ElementoLe<T> getSiguiente() {
        return siguiente;
    }
    protected void setSiguiente(ElementoLe<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
