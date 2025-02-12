package aidrivenresumescreeningsystem;

import java.util.List;

public class Utility {
    public static void displayAll(List<? extends Jobrole> jobRoles){
        for (Jobrole role : jobRoles) {

            // Call the displayRole method to display details about the job role
            role.displayRole();
        }
    }
}
