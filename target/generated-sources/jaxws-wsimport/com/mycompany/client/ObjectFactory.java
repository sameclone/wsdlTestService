
package com.mycompany.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPersonInfo_QNAME = new QName("http://testperson.mycompany.com/", "getPersonInfo");
    private final static QName _Hello_QNAME = new QName("http://testperson.mycompany.com/", "hello");
    private final static QName _GetPersonInfoResponse_QNAME = new QName("http://testperson.mycompany.com/", "getPersonInfoResponse");
    private final static QName _Person_QNAME = new QName("http://testperson.mycompany.com/", "person");
    private final static QName _HelloResponse_QNAME = new QName("http://testperson.mycompany.com/", "helloResponse");
    private final static QName _GetPersonById_QNAME = new QName("http://testperson.mycompany.com/", "getPersonById");
    private final static QName _GetPersonByIdResponse_QNAME = new QName("http://testperson.mycompany.com/", "getPersonByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetPersonInfo }
     * 
     */
    public GetPersonInfo createGetPersonInfo() {
        return new GetPersonInfo();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetPersonInfoResponse }
     * 
     */
    public GetPersonInfoResponse createGetPersonInfoResponse() {
        return new GetPersonInfoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetPersonByIdResponse }
     * 
     */
    public GetPersonByIdResponse createGetPersonByIdResponse() {
        return new GetPersonByIdResponse();
    }

    /**
     * Create an instance of {@link GetPersonById }
     * 
     */
    public GetPersonById createGetPersonById() {
        return new GetPersonById();
    }

    /**
     * Create an instance of {@link PersonRequest }
     * 
     */
    public PersonRequest createPersonRequest() {
        return new PersonRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "getPersonInfo")
    public JAXBElement<GetPersonInfo> createGetPersonInfo(GetPersonInfo value) {
        return new JAXBElement<GetPersonInfo>(_GetPersonInfo_QNAME, GetPersonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "getPersonInfoResponse")
    public JAXBElement<GetPersonInfoResponse> createGetPersonInfoResponse(GetPersonInfoResponse value) {
        return new JAXBElement<GetPersonInfoResponse>(_GetPersonInfoResponse_QNAME, GetPersonInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "getPersonById")
    public JAXBElement<GetPersonById> createGetPersonById(GetPersonById value) {
        return new JAXBElement<GetPersonById>(_GetPersonById_QNAME, GetPersonById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://testperson.mycompany.com/", name = "getPersonByIdResponse")
    public JAXBElement<GetPersonByIdResponse> createGetPersonByIdResponse(GetPersonByIdResponse value) {
        return new JAXBElement<GetPersonByIdResponse>(_GetPersonByIdResponse_QNAME, GetPersonByIdResponse.class, null, value);
    }

}
