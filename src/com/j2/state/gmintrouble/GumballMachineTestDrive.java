package com.j2.state.gmintrouble;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine(5);

        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);

        gm.insertQuarter();
        gm.turnCrank();
        gm.insertQuarter();
        gm.turnCrank();

        System.out.println(gm);
        
        gm.setState(gm.getGMInTroubleState());
        System.out.println(gm);
    }
}