package course.designpatterns.builder;

import course.designpatterns.builder.entities.AccommodationType;

import java.time.LocalDate;

public interface PlanBuilder {
    void definePeriod(LocalDate startDate, LocalDate endDate);
    void defineStudyProgram(int programId, int universityId);
    boolean defineAccommodation(AccommodationType type, LocalDate startDate, LocalDate endDate);
    void reset();
}
