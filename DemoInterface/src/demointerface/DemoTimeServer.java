/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;
import java.time.*; 


/**
 *
 * @author helen
 */
public interface DemoTimeServer {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
    LocalDate getDate();

    /**
     *
     * @return
     */
    LocalTime getTime();
}
