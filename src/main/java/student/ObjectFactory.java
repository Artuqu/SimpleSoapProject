package student;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.bykowski.springbootsoapexample.student
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetResponse }
     *
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Student }
     *
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetStudent }
     *
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

}
