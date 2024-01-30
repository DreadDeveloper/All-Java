package com.talion.celebrimbor;
import org.springframework.stereotype.Component;
@Component
public class Bike implements Vehicle
{
    @Override
    public void drive()
    {
        System.out.println("The bike is running!");
    }
}
