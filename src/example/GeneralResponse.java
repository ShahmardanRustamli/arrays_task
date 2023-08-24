package example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneralResponse<T> {
    private LocalDateTime localDateTime;
    String message;
    Integer status;

    private T obj;


//    public example.GeneralResponse<T alma> (String msj,T t){
//        return build(msj,t,)
//
//    }

    public GeneralResponse(LocalDateTime localDateTime, String message, Integer status, T obj) {
        this.localDateTime = localDateTime;
        this.message = message;
        this.status = status;
        this.obj = obj;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
