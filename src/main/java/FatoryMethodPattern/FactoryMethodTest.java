package FatoryMethodPattern;

import DesignMode.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory  iCourseFactory= new PythonFactory();
        ICourse iCourse = iCourseFactory.create();
        iCourse.record();

        ICourseFactory iCourseFactory1 = new JavaFactory();
        ICourse iCourse1 = iCourseFactory1.create();
        iCourse1.record();
    }
}
