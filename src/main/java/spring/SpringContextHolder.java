package spring;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextHolder {

    private static AbstractXmlApplicationContext context;

    static {
        try {
            context = new ClassPathXmlApplicationContext("spring-config.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static AbstractXmlApplicationContext getContext(){
        return context;
    }
}
