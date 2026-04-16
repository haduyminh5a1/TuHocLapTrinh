package JavaNangCao.JavaAdvancedLearn.ExceptionHandling;

import java.io.IOException;

public class FileTooLargeException extends IOException {
    private long actualSize;
    private long limitSize;

    public FileTooLargeException(String message, long actualSize, long limitSize){
        super(message);
        this.actualSize = actualSize;
        this.limitSize = limitSize;
    }

    public void printErrorDetail(){
        System.err.printf("Gioi han cho phep: %d bytes. File cua ban: %d bytes", limitSize, actualSize);
    }
}
