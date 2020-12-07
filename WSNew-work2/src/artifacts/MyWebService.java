
package artifacts;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyWebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebService {


    /**
     * 
     * @return
     *     returns java.util.List<artifacts.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooks", targetNamespace = "http://ws/", className = "artifacts.GetBooks")
    @ResponseWrapper(localName = "getBooksResponse", targetNamespace = "http://ws/", className = "artifacts.GetBooksResponse")
    public List<Book> getBooks();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuthors", targetNamespace = "http://ws/", className = "artifacts.GetAuthors")
    @ResponseWrapper(localName = "getAuthorsResponse", targetNamespace = "http://ws/", className = "artifacts.GetAuthorsResponse")
    public List<String> getAuthors();

    /**
     * 
     * @param arg0
     * @return
     *     returns artifacts.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookByTitle", targetNamespace = "http://ws/", className = "artifacts.GetBookByTitle")
    @ResponseWrapper(localName = "getBookByTitleResponse", targetNamespace = "http://ws/", className = "artifacts.GetBookByTitleResponse")
    public Book getBookByTitle(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "geTitles", targetNamespace = "http://ws/", className = "artifacts.GeTitles")
    @ResponseWrapper(localName = "geTitlesResponse", targetNamespace = "http://ws/", className = "artifacts.GeTitlesResponse")
    public List<String> geTitles();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFormatsByTitles", targetNamespace = "http://ws/", className = "artifacts.GetFormatsByTitles")
    @ResponseWrapper(localName = "getFormatsByTitlesResponse", targetNamespace = "http://ws/", className = "artifacts.GetFormatsByTitlesResponse")
    public List<String> getFormatsByTitles(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWeightByTitles", targetNamespace = "http://ws/", className = "artifacts.GetWeightByTitles")
    @ResponseWrapper(localName = "getWeightByTitlesResponse", targetNamespace = "http://ws/", className = "artifacts.GetWeightByTitlesResponse")
    public String getWeightByTitles(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

}
