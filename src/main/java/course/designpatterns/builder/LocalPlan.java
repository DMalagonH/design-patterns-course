package course.designpatterns.builder;

import course.designpatterns.builder.entities.Accommodation;
import course.designpatterns.builder.entities.StudyProgram;

import java.time.LocalDate;

// Product
public class LocalPlan {

    private LocalDate startDate;
    private LocalDate endDate;
    private StudyProgram studyProgram;
    private Accommodation accommodation;

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setDates(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public StudyProgram getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(StudyProgram studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public String toString() {
        return "Plan local desde " + startDate + " hasta " + endDate;
    }
}
