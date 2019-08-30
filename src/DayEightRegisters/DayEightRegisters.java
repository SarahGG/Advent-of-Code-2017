package DayEightRegisters;

import java.util.ArrayList;

/**
 * Class description
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class DayEightRegisters {
    public static void main(String[] args) {
        String unsplitCommands = "b inc 5 if a > 1\n"+
                "a inc 1 if b < 5\n"+
                "c dec -10 if a >= 1\n"+
                "c inc -20 if c == 10";

        String[] splitCommands = unsplitCommands.split("[\n]");

        for (int i = 0; i < splitCommands.length; i++) {
            System.out.println("command " + i + ": " + splitCommands[i]);
        }

        ArrayList<RegisterCommand> registerCommandList = new ArrayList<>();

        for(String commandString : splitCommands) {
            registerCommandList.add(new RegisterCommand(commandString));
        }
        //printing all the commands by the name of the register they affect
        for(RegisterCommand registerCommand : registerCommandList) {
            System.out.println(registerCommand.toString());
        }
    }
}
