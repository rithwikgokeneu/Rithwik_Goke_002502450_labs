/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author rithwikvarma
 */
package analytics;

import java.util.Comparator;
import java.util.Map;
import model.User;

public class UserMapComparator implements Comparator<User> {
    private Map<Integer, Integer> userMap;
    private boolean descending;

    public UserMapComparator(Map<Integer, Integer> userMap, boolean descending) {
        this.userMap = userMap;
        this.descending = descending;
    }

    @Override
    public int compare(User u1, User u2) {
        int val1 = userMap.getOrDefault(u1.getId(), 0);
        int val2 = userMap.getOrDefault(u2.getId(), 0);

        if (descending) {
            return Integer.compare(val2, val1);  // high to low
        } else {
            return Integer.compare(val1, val2);  // low to high
        }
    }
}
