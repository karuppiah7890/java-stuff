package xpath.demo;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static javax.xml.XMLConstants.ACCESS_EXTERNAL_DTD;
import static javax.xml.XMLConstants.ACCESS_EXTERNAL_SCHEMA;


public class XPathEvaluator {
    private final File file;

    public XPathEvaluator(File file) {
        this.file = file;
    }

    public String evaluate(String expression) throws IOException, ParserConfigurationException,
            SAXException, XPathExpressionException {
        try (FileInputStream fileIS = new FileInputStream(file)) {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            // To avoid some security vulnerabilities
            // https://rules.sonarsource.com/java/RSPEC-2755
            builderFactory.setAttribute(ACCESS_EXTERNAL_DTD, "");
            builderFactory.setAttribute(ACCESS_EXTERNAL_SCHEMA, "");
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(fileIS);
            XPath xPath = XPathFactory.newInstance().newXPath();
            var node = (Node) xPath.compile(expression)
                    .evaluate(xmlDocument, XPathConstants.NODE);

            return node.getTextContent();
        }
    }
}
