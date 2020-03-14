package my.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {

    private static Map<String, Account> map = new HashMap<>();
    static {
        try {
            map.put("FREE",(Account) new FreeAccount().clone());
            map.put("GOLD",(Account) new GoldAccount().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
    public static Account getAccountClone(String typeOfAccount){
        return map.get(typeOfAccount);
    }
}
