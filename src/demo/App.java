package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;




public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Resource r=new ClassPathResource("Bean.xml");
		BeanFactory factory=new XmlBeanFactory(r);
	//	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\User\\Bean.xml"); //("C:/Users/Nikhil/workspace/HelloSpring/src/Sconf.xml");
		Employee m=(Employee)factory.getBean("emp");
		System.out.println(m);
		m.setId(20);
		m.setName("Nikhil");
		System.out.println(m);
		
	}

}
