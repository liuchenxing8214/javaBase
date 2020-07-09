package FatoryMethodPattern;

import DesignMode.ICourse;
import DesignMode.JavaCourse;

public class JavaFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
