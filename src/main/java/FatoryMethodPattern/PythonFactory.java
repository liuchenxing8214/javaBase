package FatoryMethodPattern;

import DesignMode.ICourse;
import DesignMode.PythonCourse;

public class PythonFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
