package in.edac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloHibernate1{
	public static final SessionFactory seccionFactory=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args) {
		
		Session seccion=seccionFactory.openSession();
		
	System.out.println("Connection check!!");
	seccion.close();
	}
}
