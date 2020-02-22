public class Rule {

    private String direction;
    private String protocol;
    private Port port;
    private IpAddress ip;

    Rule(String direction, String protocol, String port, String ip) {
        this.direction = direction;
        this.protocol = protocol;
        this.port = new Port(port);
        this.ip = new IpAddress(ip);
    }

    // Override equals() to check that two rules are the same if ip address, port, direction, and protocol are same.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rule)) {
            return false;
        }

        Rule rule = (Rule) o;

        return (
                rule.direction.equals(this.direction) && rule.protocol.equals(this.protocol) &&
                        rule.port.isInPortRange(this.port) && rule.ip.isInIpRange(this.ip)
        );
    }

    @Override
    public String toString() {
        return "com.java.main.Rule{" + "direction='" + direction + '\'' + ", protocol='" + protocol + '\'' +
                ", port=" + port + ", ip=" + ip + '}';
    }
}
