import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Firewall {

    private Set<Rule> rules = new HashSet<Rule>();

    Firewall(String filepath) throws IOException {
        File file = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String ruleLine;

        while ((ruleLine = br.readLine()) != null) {
            String[] ruleTraits = ruleLine.split(",");
            rules.add(new Rule(ruleTraits[0], ruleTraits[1], ruleTraits[2], ruleTraits[3]));
        }
    }

    /* Method that determines whether a packet is to be accepted or not by comparing an incoming packet to a
     * set of given rules.
     */
    boolean accept_packet(String direction, String protocol, Integer port, String ip_address) {
        Rule incomingPacket = new Rule(direction, protocol, String.valueOf(port), ip_address);

        for (Rule rule : rules) {
            if (incomingPacket.equals(rule)) {
                return true;
            }
        }
        return false;
    }
}