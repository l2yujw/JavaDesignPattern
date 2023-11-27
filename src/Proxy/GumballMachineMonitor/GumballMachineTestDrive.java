package Proxy.GumballMachineMonitor;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count = 0;

		// 실행전 입력해주어야 함
		/*
			Run -> Edit Configurations -> Application 추가 -> 문구 추가
		 */
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
        	count = Integer.parseInt(args[1]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		GumballMachine gumballMachine = new GumballMachine(args[0], count);

		GumballMonitor monitor = new GumballMonitor(gumballMachine);

 
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		monitor.report();
	}
}
