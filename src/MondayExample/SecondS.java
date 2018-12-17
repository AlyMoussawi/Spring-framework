package MondayExample;

import javax.xml.ws.Service;

public class SecondS {
    private String mail;
    private String password;
    private ThirdD thirdD;

    public ThirdD getThirdD() {
        return thirdD;
    }

    public void setThirdD(ThirdD thirdD) {
        this.thirdD = thirdD;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
