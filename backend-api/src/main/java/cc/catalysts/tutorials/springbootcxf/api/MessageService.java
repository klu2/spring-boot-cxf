package cc.catalysts.tutorials.springbootcxf.api;

import cc.catalysts.tutorials.springbootcxf.dto.ServerInfoDto;

import javax.jws.WebService;

/**
 * @author Klaus Lehner
 */
@WebService
public interface MessageService {

    String sayHello();

    ServerInfoDto getServerInfo();

}
