package AbastractFactoryPattern;



public class CustomerTest {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        javaFactory.createNote().edit();
        javaFactory.createVideo().record();

        PythonFactory pythonFactory =  new PythonFactory();
        pythonFactory.createVideo().record();
        pythonFactory.createNote().edit();
    }
}
