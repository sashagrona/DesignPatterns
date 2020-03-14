package my.patterns;

import my.patterns.adapter.*;
import my.patterns.prototype.Account;
import my.patterns.prototype.AccountCache;
import my.patterns.prototype.FreeAccount;

public class Main {

    public static void main(String[] args) {
        AirTransport plane = new Plane();
        plane.fly();
        SelfTransport superman = new Superman();
        superman.move();
        SupermanAdapter adapter = new SupermanAdapter(superman);
        adapter.fly();
    }
}
