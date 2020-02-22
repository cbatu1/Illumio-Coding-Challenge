/* This class is created to handle the fact that port inputs could either be a range or a single integer. It will be
 * used in the Rule.java class when declaring a port variable for when rules are inputted from the csv file.
 */

class Port {

    private int minRange;
    private int maxRange;

    Port(String portStr) {

        if (!portStr.contains("-")) {
            minRange = Integer.parseInt(portStr);
            maxRange = Integer.parseInt(portStr);
        }
        else {
            String[] ranges = portStr.split("-");
            minRange = Integer.parseInt(ranges[0]);
            maxRange = Integer.parseInt(ranges[1]);
        }
    }

    boolean isInPortRange(Port port) {
        return port.minRange >= this.minRange && port.maxRange <= this.maxRange;
    }
}
