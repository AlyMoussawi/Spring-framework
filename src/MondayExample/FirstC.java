package MondayExample;

import javax.xml.ws.Service;

public class FirstC {
    private String name;
    private String address;
    private SecondS secondS;

    public SecondS getSecondS() {
        return secondS;
    }

    public void setSecondS(SecondS secondS) {
        this.secondS = secondS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
