package ai.jobiak.usesource;
import org.springframework.core.io.FileSystemResource;

import ai.jobiak.ifaces.BDigital;
import ai.jobiak.source.A;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;



public class TestAB {
	public static void main(String[]args) {
		
		//B b=new B();
		//b.doPublishing();
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		/*B b=(B)factory.getBean("b");
		b.doPublishing();
		if(factory.containsBean("aObj")) {
			A a=(A)factory.getBean("aObj");
			a.print();
		}*/
		BDigital bDigital=(BDigital)factory.getBean("bDigital");
		bDigital.publish();
	}

}
