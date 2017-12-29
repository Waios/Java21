package de.merit.azubi.java21;

import java.time.LocalDateTime;

public class Roboter {


    static LocalDateTime dateTime = LocalDateTime.now();
    String status;
    String hersteller;


    public String toString() {
        return "Roboter{" +
                "\nLocalDateTime='" + dateTime + '\'' +
                "\nStatus='" + status + '\'' +
                ", \nHersteller='" + hersteller + '\'' +
                '}';
    }
}
