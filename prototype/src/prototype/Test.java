package prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String args[]){
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
		    Employee e1=(Employee) context.getBean("emp",Employee.class); 
		    e1.setId(123);
		    e1.setName("Ram");
		    e1.display();
		    
		    Employee e2=(Employee) context.getBean("emp",Employee.class); 
		    e2.setId(124);
		    e2.setName("Sam");
		    e2.display();
}
}