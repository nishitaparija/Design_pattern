public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello Everyone!");
    }
}
class SingletonPatternDemo {
    public static void main(String[] args) {
        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}