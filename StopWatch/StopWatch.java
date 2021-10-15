package StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime,endTime;// LocalTime :Giờ địa phương

    public StopWatch(){
        startTime =LocalTime.now();
    }
    public StopWatch(LocalTime startTime,LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public void start(){
        startTime=LocalTime.now();
    }
    public void stop(){
        endTime = LocalTime.now();
    }// getHout:Nhận trường giờ trong ngày  getMinute :Nhận trường phút của giờ    getSecond : Nhận trường giây phút.
    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond/100;
    }
}
