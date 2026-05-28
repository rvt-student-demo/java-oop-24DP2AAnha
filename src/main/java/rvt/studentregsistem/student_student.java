package rvt.studentregsistem;


import java.time.LocalDateTime;

public class student_student {

    private String vards;
    private String uzvards;
    private String epasts;
    private String perskods;
    private LocalDateTime timestamp;

    public student_student (String name, String surname, String email, String code, LocalDateTime stamp) {

        this.vards = name;
        this.uzvards = surname;
        this.epasts = email;
        this.perskods = code;
        this.timestamp = stamp;
        
    }
}