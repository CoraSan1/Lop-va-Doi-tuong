package BaiTap.StopWatch;


import java.time.LocalDateTime;

public class LopStopWatch {
   private LocalDateTime startTime, endTime;

    public LopStopWatch() {
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public void start(){
        startTime = LocalDateTime.now();
    }
    public void end(){
        endTime = LocalDateTime.now();
    }
    public int getElapsedTime(){
        return endTime.getSecond() - startTime.getSecond();
    }

}


