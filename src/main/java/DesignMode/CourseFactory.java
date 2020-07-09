package DesignMode;

public class CourseFactory {
    public ICourse create(String name){
        if ("java".equals(name)) {
            return new JavaCourse();
        }else if("Python".equals(name)){
            return new PythonCourse();
        }else{
            return null;
        }
    }

}
