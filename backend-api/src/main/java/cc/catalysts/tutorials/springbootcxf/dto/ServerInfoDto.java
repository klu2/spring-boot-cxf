package cc.catalysts.tutorials.springbootcxf.dto;

import java.io.Serializable;

/**
 * @author Klaus Lehner
 */
public class ServerInfoDto implements Serializable {

    private String serverName;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
