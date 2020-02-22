/* This class is created to handle the fact that IP Address inputs could either be a range or a single integer. It will
 * be used in the Rule.java class when declaring an IpAddress variable for when rules are inputted from the csv file.
 */

class IpAddress {

    private int minRange;
    private int maxRange;

    IpAddress(String IpStr) {
        IpStr = IpStr.replace(".", "");

        if (!IpStr.contains("-")) {
            minRange = Integer.parseInt(IpStr);
            maxRange = Integer.parseInt((IpStr));
        }
        else {
            String[] ranges = IpStr.split("-");
            minRange = Integer.parseInt(ranges[0]);
            maxRange = Integer.parseInt(ranges[1]);
        }
    }

    boolean isInIpRange(IpAddress IpAdd) {
        return IpAdd.minRange >= this.minRange && IpAdd.maxRange <= this.maxRange;
    }
}
