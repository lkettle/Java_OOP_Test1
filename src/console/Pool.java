package console;
/* Pool Interface (4 marks)
• Create an interface called Pool (1 mark)  ok
• Give the interface 1 constant values (1 mark)  ok
• Give the interface 2 methods (2 marks) ok */


public interface Pool {
    boolean hasPool = false;  //default is public and final
    int poolCleanUpTimesPerYear();  //methods
    double poolMaintenanceCost();
}
