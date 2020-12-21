
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _CTOF_QNAME = new QName("http://Service/", "C_TO_F");
    private final static QName _FTOC_QNAME = new QName("http://Service/", "F_TO_C");
    private final static QName _CTOFResponse_QNAME = new QName("http://Service/", "C_TO_FResponse");
    private final static QName _FTOCResponse_QNAME = new QName("http://Service/", "F_TO_CResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FTOCResponse }
     * 
     */
    public FTOCResponse createFTOCResponse() {
        return new FTOCResponse();
    }

    /**
     * Create an instance of {@link CTOF }
     * 
     */
    public CTOF createCTOF() {
        return new CTOF();
    }

    /**
     * Create an instance of {@link FTOC }
     * 
     */
    public FTOC createFTOC() {
        return new FTOC();
    }

    /**
     * Create an instance of {@link CTOFResponse }
     * 
     */
    public CTOFResponse createCTOFResponse() {
        return new CTOFResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTOF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "C_TO_F")
    public JAXBElement<CTOF> createCTOF(CTOF value) {
        return new JAXBElement<CTOF>(_CTOF_QNAME, CTOF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTOC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "F_TO_C")
    public JAXBElement<FTOC> createFTOC(FTOC value) {
        return new JAXBElement<FTOC>(_FTOC_QNAME, FTOC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CTOFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "C_TO_FResponse")
    public JAXBElement<CTOFResponse> createCTOFResponse(CTOFResponse value) {
        return new JAXBElement<CTOFResponse>(_CTOFResponse_QNAME, CTOFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTOCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "F_TO_CResponse")
    public JAXBElement<FTOCResponse> createFTOCResponse(FTOCResponse value) {
        return new JAXBElement<FTOCResponse>(_FTOCResponse_QNAME, FTOCResponse.class, null, value);
    }

}
