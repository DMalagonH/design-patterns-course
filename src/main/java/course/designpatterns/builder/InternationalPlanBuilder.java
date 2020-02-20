package course.designpatterns.builder;

import course.designpatterns.builder.entities.Accommodation;
import course.designpatterns.builder.entities.AccommodationType;
import course.designpatterns.builder.entities.StudyProgram;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InternationalPlanBuilder implements PlanBuilder {

    private InternationalPlan plan;

    public InternationalPlanBuilder() {
        this.reset();
    }

    @Override
    public void definePeriod(LocalDate startDate, LocalDate endDate) {
        plan.setStartDate(startDate);
        plan.setEndDate(endDate);
    }

    @Override
    public void defineStudyProgram(int programId, int universityId) {
        StudyProgram program = new StudyProgram(programId, universityId);
        plan.setStudyProgram(program);
    }

    @Override
    public boolean defineAccommodation(AccommodationType type, LocalDate startDate, LocalDate endDate) {
        boolean result = false;

        if (type == AccommodationType.HOTEL) {
            long days = ChronoUnit.DAYS.between(startDate, endDate);
            if (days < 15) {
                result = true;
                Accommodation accommodation = new Accommodation(type, startDate, endDate);
                plan.addAccommodation(accommodation);
            }
        } else {
            Accommodation accommodation = new Accommodation(type, startDate, endDate);
            plan.addAccommodation(accommodation);
            result = true;
        }

        return result;
    }

    @Override
    public void reset() {
        plan = new InternationalPlan();
    }

    public InternationalPlan getPlan() {
        InternationalPlan builtPlan = plan;
        reset();
        return  builtPlan;
    }
}
