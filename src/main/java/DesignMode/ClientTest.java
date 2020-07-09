package DesignMode;

public class ClientTest {
    public static void main(String[] args) {
        //父类 ICourse 指向子类 JavaCourse 的引用
        ICourse iCourse = new JavaCourse();
         iCourse.record();
    }
}
