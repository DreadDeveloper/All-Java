package com.talion.spring_anno;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MediaTek implements Processor
{
    @Override
    public void processor()
    {
        System.out.println("Dual Core Shitass");
    }
}
