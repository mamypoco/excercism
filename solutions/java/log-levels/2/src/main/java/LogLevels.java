public class LogLevels {

    public static String message(String logLine) {
        // "[ERROR]: Invalid operation" => "Invalid operation"
        return logLine.split(": ", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        // "[ERROR]: Invalid operation" => "error"
        return logLine.split(": ", 2)[0].replace("[", "").replace("]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        // "[INFO]: Operation completed" => "Operation completed (info)"
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
