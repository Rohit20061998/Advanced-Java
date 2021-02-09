package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloHibernate{

	public static void main(String[] args) {
		SessionFactory seccionFactory=new Configuration().configure().buildSessionFactory();
		Session seccion=seccionFactory.openSession();
		
	System.out.println("Hello Hibru!!!");
	seccion.close();
	}
}