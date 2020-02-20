package course.designpatterns.builder;

import course.designpatterns.builder.entities.Accommodation;
import course.designpatterns.builder.entities.AccommodationType;
import course.designpatterns.builder.entities.StudyProgram;

import java.time.LocalDate;

public class LocalPlanBuilder implements PlanBuilder {

    private LocalPlan plan;

    public LocalPlanBuilder() {
        reset();
    }

    @Override
    public void definePeriod(LocalDate startDate, LocalDate endDate) {
        plan.setDates(startDate, endDate);
    }

    @Override
    public void defineStudyProgram(int programId, int universityId) {
        StudyProgram program = new StudyProgram(programId, universityId);
        plan.setStudyProgram(program);
    }

    @Override
    public boolean defineAccommodation(AccommodationType type, LocalDate startDate, LocalDate endDate) {
        Accommodation accommodation = new Accommodation(type, startDate, endDate);
        plan.setAccommodation(accommodation);
        return true;
    }

    @Override
    public void reset() {
        plan = new LocalPlan();
    }

    public LocalPlan getPlan() {
        LocalPlan builtPlan = plan;
        reset();
        return builtPlan;
    }
}
