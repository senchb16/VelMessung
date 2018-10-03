
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class Measurement {
   
    private LocalDate date;
    private LocalTime time;
    private String kennzeichen;
    private int vgemessen;
    private int verlaubt;
    
    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getVgemessen() {
        return vgemessen;
    }

    public int getVerlaubt() {
        return verlaubt;
    }

    public Measurement(LocalDate date, LocalTime time, String kennzeichen, int vgemessen, int verlaubt) {
        this.date = date;
        this.time = time;
        this.kennzeichen = kennzeichen;
        this.vgemessen = vgemessen;
        this.verlaubt = verlaubt;
    }
    
}
