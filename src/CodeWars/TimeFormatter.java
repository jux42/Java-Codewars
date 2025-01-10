package CodeWars;

public class TimeFormatter {
    public static String formatDuration(int seconds) {

        StringBuilder timePhrase = new StringBuilder();
        int counter = 0;

        while (seconds >= (365*86400)){
            counter++;
            seconds-=(365*86400);
            if (seconds == 0) return "" + counter + " year" + (counter == 1 ?"" : "s");
        }
        if (counter >0) timePhrase.append(counter).append(" year").append(counter == 1 ? "" : "s");

        counter = 0;
        while (seconds >= 86400){
            counter++;
            seconds-=86400;
            if (seconds == 0 && timePhrase.isEmpty()) return counter + " day" + (counter == 1 ?"" : "s");
            else if(seconds == 0) return timePhrase + " and " +  counter + " day" + (counter == 1 ?"" : "s");
        }
        if (counter>0 && timePhrase.isEmpty()) timePhrase.append(counter).append(" day").append(counter == 1 ? "" : "s");
        else if (counter>0) timePhrase.append(", ").append(counter).append(" day").append(counter == 1 ? "" : "s");

        counter = 0;
        while (seconds >= 3600){
            counter++;
            seconds-=3600;
            if (seconds == 0 && timePhrase.isEmpty()) return counter + " hour" + (counter == 1 ?"" : "s");
            else if(seconds == 0) return timePhrase + " and " +  counter + " hour" + (counter == 1 ?"" : "s");

        }
        if (counter>0 && timePhrase.isEmpty()) timePhrase.append(counter).append(" hour").append(counter == 1 ? "" : "s");
        else if (counter>0) timePhrase.append(", ").append(counter).append(" hour").append(counter == 1 ? "" : "s");

        counter = 0;
        while (seconds >= 60){
            counter++;
            seconds-=60;
            if (seconds == 0 && timePhrase.isEmpty()) return counter + " minute" + (counter == 1 ?"" : "s");
            else if(seconds == 0) return timePhrase + " and " +  counter + " minute" + (counter == 1 ?"" : "s");

        }
        if (counter>0 && timePhrase.isEmpty()) timePhrase.append(counter).append(" minute").append(counter == 1 ? "" : "s");
        else if (counter>0) timePhrase.append(", ").append(counter).append(" minute").append(counter == 1 ? "" : "s");

        counter = 0;

        while (seconds >= 1){
            counter++;
            seconds--;
            if (seconds == 0 && timePhrase.isEmpty()) return counter + " second" + (counter == 1 ?"" : "s");
            else if(seconds == 0) return timePhrase + " and " +  counter + " second" + (counter == 1 ?"" : "s");

        }
        if (counter>0 && timePhrase.isEmpty()) timePhrase.append(counter).append(" second").append(counter == 1 ? "" : "s");
        else if (counter>0) timePhrase.append(", ").append(counter).append(" second").append(counter == 1 ? "" : "s");

        return timePhrase.isEmpty()
                ? "now"
                : timePhrase.toString();
    }
}