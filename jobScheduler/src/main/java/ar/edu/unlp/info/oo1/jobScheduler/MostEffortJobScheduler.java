package ar.edu.unlp.info.oo1.jobScheduler;
import java.util.Comparator;

public class MostEffortJobScheduler extends JobScheduler {
    
    protected JobDescription selectNextJob() {
        return jobs.stream()
                .max(Comparator.comparingDouble(JobDescription::getEffort))
                .orElse(null);
    }
}
