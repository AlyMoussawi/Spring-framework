package MondayExample.JUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("thirdD3")
@Scope("singleton")
@PropertySource("classpath:/MondayExample/MondayExample2/config.properties")

public class ThirdD3 {

    @Value("${ip}")
    private String ip;

    @Value("${port}")
    private String port;

    @Value("${login}")
    private String login;

    @Value("${password}")
    private String password;


    public void run(){
        System.out.println(toString());
    }

    public String toString(){
        return "thirdD2 [ip=" + ip + ", port=" + port + ", login " + login + ", password " + password + "]";
    }


    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
