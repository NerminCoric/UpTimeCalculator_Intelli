package a.fhtw.uptimecalculator.controller;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.InvalidParameterException;

public class DownTimeController {
    @GetMapping("/downtime/minutes") //Kommentar
    public double calculateDowntimeMinutes(@RequestParam double relative) {
        if (relative < 0.0 || relative > 100.0)
            throw new InvalidParameterException();
        double minutesOfMonth = 60*24*30;
        double defineUptimeInPercent = relative /100;
        return minutesOfMonth * defineUptimeInPercent; //downtime in minutes
    }

}
