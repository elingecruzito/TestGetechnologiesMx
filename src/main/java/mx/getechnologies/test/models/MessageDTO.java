package mx.getechnologies.test.models;

import java.time.LocalDateTime;

public class MessageDTO {

    private LocalDateTime time;
    private String message;


    public MessageDTO() {
    }


    public MessageDTO(LocalDateTime time, String message) {
        this.time = time;
        this.message = message;
    }


    public LocalDateTime getTime() {
        return this.time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
