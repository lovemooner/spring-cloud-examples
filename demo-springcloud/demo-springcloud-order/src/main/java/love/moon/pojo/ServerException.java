package love.moon.pojo;

import net.logstash.logback.encoder.org.apache.commons.lang.exception.ExceptionUtils;

public class ServerException extends Exception {
    // 相关异常的堆栈信息
    private String stack;

    public String getStack() {
        return stack;
    }

    public ServerException(String message, Throwable throwable) {
        super(message, throwable);
        this.stack = ExceptionUtils.getStackTrace(throwable);
    }

}
