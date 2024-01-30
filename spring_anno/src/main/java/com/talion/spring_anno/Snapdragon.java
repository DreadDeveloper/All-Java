package com.talion.spring_anno;
import org.springframework.stereotype.Component;
@Component
public class Snapdragon implements Processor
{
    public void processor()
    {
        System.out.println("Octa Core Snapdragon Processor");
    }
}
