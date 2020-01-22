package OnetoOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    
    
public class Store {    
public static void main(String[] args) {    
      
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("OnetoOne.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();   
      
    Employee e1=new Employee();    
    e1.setName("Vineela");    
    e1.setEmail("vineevinni@gmail.com");    
        
    Address address1=new Address();    
    address1.setAddressLine1("D.no:6-99/1,Ganesh Nagar,Guntupalli");    
    address1.setCity("Ibrahimpatanam");    
    address1.setState("Ap");    
    address1.setCountry("India");    
    address1.setPincode(201301);    
        
    e1.setAddress(address1);    
    address1.setEmployee(e1);    
        
    session.persist(e1);    
    t.commit();    
        
    session.close();    
    System.out.println("Saved Successfully");    
}    
}    

