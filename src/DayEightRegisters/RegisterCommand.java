package DayEightRegisters;

/**
 * Class description
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class RegisterCommand {
    StringBuilder stringBuilder;
    String affectedRegister;
    int sumChange;
    boolean increaseRegister;

    public RegisterCommand(String commandString) {
        this.stringBuilder = new StringBuilder();
        initRegisterCommand(commandString);
    }

    public String toString() {
        return "Affected Register: " + this.affectedRegister + "\n"
                + "Increasing: " + this.increaseRegister + "\n"
                + "Sum Change Amount: " + this.sumChange + "\n";

    }

    private void initRegisterCommand(String commandString) {
        String[] commandDetails = commandString.split("\\s");

        // whats the name of the register we're going to change?
        setAffectedRegister(commandDetails[0]);

        // is the change an increase or decrease?
        if(commandDetails[1].equals("inc")) {
            increaseRegister = true;
        } else {
            increaseRegister = false;
        }

        // how much are we taking away/adding?
        sumChange = Integer.parseInt(commandDetails[2]);
    }

    public String getAffectedRegister() {
        return this.affectedRegister;
    }

    public void setAffectedRegister(String affectedRegister) {
        this.affectedRegister = affectedRegister;
    }

    public boolean isIncreaseRegister() {
        return this.increaseRegister;
    }

    public void setIncreaseRegister(boolean increaseRegister) {
        this.increaseRegister = increaseRegister;
    }
}
