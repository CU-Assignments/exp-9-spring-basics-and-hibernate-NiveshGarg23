import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainCRUD {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Create
        Transaction tx = session.beginTransaction();
        Student s1 = new Student("Aman", 22);
        session.save(s1);
        tx.commit();

        // Read
        Student student = session.get(Student.class, s1.getId());
        System.out.println("Read: " + student);

        // Update
        tx = session.beginTransaction();
        student.setAge(23);
        session.update(student);
        tx.commit();
        System.out.println("Updated: " + student);

        // Delete
        tx = session.beginTransaction();
        session.delete(student);
        tx.commit();
        System.out.println("Deleted: " + student);

        session.close();
    }
}
