package com.caoO.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class XpathUtils {
	public static Element getElement(String statement) throws DocumentException {
		Document doc = new SAXReader().read("E:/javaee/eclipse-workspace/XpathUtils/src/c3p0-config.xml");
		return (Element) doc.selectSingleNode(statement);
	}
	
	public static String getText(String statement) throws DocumentException {
		Document doc = new SAXReader().read("E:/javaee/eclipse-workspace/XpathUtils/src/c3p0-config.xml");
		Element element = (Element) doc.selectSingleNode(statement);
		return element.getText();
	}
	
	
	public static void main(String[] args) throws DocumentException {
		Element element = getElement("//property[@name='driverClass']");
		String text = element.getText();
		System.out.println(text);
	}
	
	@Test
	public void test01() throws DocumentException {
		Element element = getElement("//property[@name='driverClass']");
		String text = element.getText();
		System.out.println(text);
	}
}
