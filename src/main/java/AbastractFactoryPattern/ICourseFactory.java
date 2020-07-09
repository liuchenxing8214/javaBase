package AbastractFactoryPattern;

public interface ICourseFactory {
    INote createNote();
    IVideo createVideo();
}
