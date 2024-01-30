package com.talion.celebrimbor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CelebrimborApplication {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car)applicationContext.getBean("car");
//        vehicle.drive();
//        Tyre tyre = (Tyre)applicationContext.getBean("tyre") ;
        car.drive();
    }
}
