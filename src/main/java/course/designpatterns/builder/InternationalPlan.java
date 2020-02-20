package course.designpatterns.builder;

import course.designpatterns.builder.entities.Accommodation;
import course.designpatterns.builder.entities.StudyProgram;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Product
public class InternationalPlan {
    private LocalDate startDate;
    private LocalDate endDate;
    private StudyProgram studyProgram;

    public List<Accommodation> accommodationList;

    public InternationalPlan() {
        accommodationList = new ArrayList<>();
    }

    public void addAccommodation(Accommodation accommodation) {
        accommodationList.add(accommodation);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public StudyProgram getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(StudyProgram studyProgram) {
        this.studyProgram = studyProgram;
    }

    public String toString() {
        return "Plan internacional desde " + startDate + " hasta " + endDate;
    }
}
