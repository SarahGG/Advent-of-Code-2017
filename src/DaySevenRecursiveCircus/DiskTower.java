package DaySevenRecursiveCircus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class description
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class DiskTower {
    private String parent;
    private String name;
    private String children;

    public DiskTower(String rollCall) {
        List list = Arrays.asList(rollCall.split("(?<!,)\\s"));
        this.name = list.get(0).toString();
        try {
            this.children = list.get(3).toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            this.children = "";
        }
    }

    public void initParent(ArrayList<DiskTower> diskTowerArrayList) {
        for(DiskTower potentialParent : diskTowerArrayList) {
            if (potentialParent.getChildren().contains(name)) {
                parent = potentialParent.getName();
            }
        }
    }

    public String getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    private String getChildren() {
        return children;
    }
}