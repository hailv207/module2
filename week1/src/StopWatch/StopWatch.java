package StopWatch;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    private LocalTime startTime, endTime;

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }
    public Duration getElapsedTime(){
        return Duration.between(this.startTime,this.endTime);
    }
}
