package DesignMode;

import java.util.Calendar;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.create("java");
        course.record();
        Calendar.getInstance();
    }
}
