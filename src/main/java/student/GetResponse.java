package student;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "student"
})
@XmlRootElement(name = "getResponse", namespace = "http://bykowski.pl/soup-example")
public class GetResponse {

    @XmlElement(required = true)
    protected Student student;

    /**
     * Gets the value of the pl.bykowski.springbootsoapexample.student property.
     *
     * @return
     *     possible object is
     *     {@link Student }
     *
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Sets the value of the pl.bykowski.springbootsoapexample.student property.
     *
     * @param value
     *     allowed object is
     *     {@link Student }
     *
     */
    public void setStudent(Student value) {
        this.student = value;
    }

}
