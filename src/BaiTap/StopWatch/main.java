package BaiTap.StopWatch;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        LopStopWatch stopWatch = new LopStopWatch();

        stopWatch.start();
        System.out.println(stopWatch.getStartTime());

        Scanner sc = new Scanner(System.in);
        sc.next();

        stopWatch.end();
        System.out.println(stopWatch.getEndTime());

        stopWatch.getElapsedTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
//stopWatch.start();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        String formatDateTime = stopWatch.getStartTime().format(formatter);
//        System.out.println(formatDateTime);
//
//        Scanner sc = new Scanner(System.in);
//        sc.next();
//
//        stopWatch.end();
//        String formatDateTime1 = stopWatch.getEndTime().format(formatter);
//        System.out.println(formatDateTime1);