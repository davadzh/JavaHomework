package utils;

        import models.*;
        import org.hibernate.SessionFactory;
        import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
        import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil(){}

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            try {
                //String path = "C:\\Users\\Давид\\IdeaProjects\\HibernateDavid\\src\\main\\resources";
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Answer.class);
                configuration.addAnnotatedClass(Group.class);
                configuration.addAnnotatedClass(Question.class);
                configuration.addAnnotatedClass(Role.class);
                configuration.addAnnotatedClass(Schedule.class);
                configuration.addAnnotatedClass(StudentAnswer.class);
                configuration.addAnnotatedClass(Subject.class);
                configuration.addAnnotatedClass(Test.class);
                configuration.addAnnotatedClass(TestList.class);
                configuration.addAnnotatedClass(User.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()./*configure("hibernate.cfg.xml");*/
                        applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}