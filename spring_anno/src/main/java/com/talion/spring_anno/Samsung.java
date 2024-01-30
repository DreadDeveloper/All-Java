package com.talion.spring_anno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung
{
    @Autowired
    //@Qualifier("snapdragon")
    Processor processor;
    public Processor getProcessor()
    {
        return processor;
    }
    public void setProcessor(Processor processor)
    {
        this.processor = processor;
    }
    public void config()
    {
        processor.processor();
        System.out.println("4gb RAM\n48MP Camera");
    }
}
