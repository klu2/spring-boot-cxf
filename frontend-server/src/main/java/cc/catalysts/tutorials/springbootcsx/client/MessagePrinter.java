package cc.catalysts.tutorials.springbootcsx.client;

import cc.catalysts.tutorials.springbootcxf.api.MessageService;
import cc.catalysts.tutorials.springbootcxf.dto.ServerInfoDto;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Klaus Lehner
 */
@Service
public class MessagePrinter implements InitializingBean {

    private final MessageService messageService;

    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(messageService.sayHello());

        ServerInfoDto serverInfo = messageService.getServerInfo();
        System.out.println(serverInfo.getServerName());
    }
}
