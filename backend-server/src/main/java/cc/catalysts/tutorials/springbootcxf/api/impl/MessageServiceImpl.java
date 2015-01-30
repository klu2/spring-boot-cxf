package cc.catalysts.tutorials.springbootcxf.api.impl;

import cc.catalysts.tutorials.springbootcxf.api.MessageService;

import javax.jws.WebService;

/**
 * @author Klaus Lehner
 */
@WebService(endpointInterface = "cc.catalysts.tutorials.springbootcxf.api.MessageService", serviceName = "messageService")
public class MessageServiceImpl implements MessageService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
