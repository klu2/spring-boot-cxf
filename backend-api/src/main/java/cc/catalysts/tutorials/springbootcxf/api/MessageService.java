package cc.catalysts.tutorials.springbootcxf.api;

import javax.jws.WebService;

/**
 * @author Klaus Lehner
 */
@WebService
public interface MessageService {

    String sayHello();

}
