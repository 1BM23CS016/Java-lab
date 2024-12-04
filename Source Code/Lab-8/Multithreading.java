class BMS extends Thread {
    public void run() {
        try {
            for(int i=0;i<3;i++) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Sleep for 10 seconds
            }
        }
catch (InterruptedException e) {
   System.out.println("BMS Thread interrupted");
}
    }
}
class CSE extends Thread {
    public void run() {
        try {
            for(int j=0;j<15;j++) {
                System.out.println("CSE");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        }
catch (InterruptedException e) {
   System.out.println("CSE Thread interrupted");
}
    }
}

public class Multithreading{
    public static void main(String[] args) {
        BMS bms = new BMS();
        CSE cse = new CSE();
        bms.start();
        cse.start();
    }
}
