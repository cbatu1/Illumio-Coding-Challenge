# Illumio-Coding-Challenge
My solution to the Illumio Coding Challenge for the Summer 2020 Internships.

#### Thought Process Behind the Solution

The `Firewall.java` is the main class that includes a constructor that takes in a file path as a parameter for the input rules.
It goes through the inputted csv file line by line and creates new `Rule` instances using the `Rule.java` class and adds them to 
a HashSet.

The `Rule.java` is used to create a rule by taking in the four parameters of a rule from the csv file line by line. 

The `Port.java` and the `IpAddress.java` classes are used to handle the cases of the ports and IP addresses either being inputted as a single 
unit or as a range. 
