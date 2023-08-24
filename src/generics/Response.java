package generics;

import java.time.LocalDateTime;

public class Response<T> {
    LocalDateTime timeStamp;
    int status;
    String message;
    T data;

    public Response() {
    }

    public Response(LocalDateTime timeStamp, int status, String message, T data) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "timeStamp=" + timeStamp +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
