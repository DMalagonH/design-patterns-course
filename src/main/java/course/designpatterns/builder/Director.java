package course.designpatterns.builder;

import course.designpatterns.builder.entities.AccommodationType;

import java.time.LocalDate;

public class Director {

    private PlanBuilder builder;

    public Director(PlanBuilder builder) {
        this.builder = builder;
    }

    public void constructMBAPlan() {
        LocalDate now = LocalDate.now();

        // El plan dura 6 meses y empieza 2 meses a partir de la fecha de hoy
        LocalDate startDate = now.plusMonths(2);
        LocalDate endDate = now.plusMonths(8);

        builder.reset();
        builder.definePeriod(startDate, endDate);
        builder.defineAccommodation(AccommodationType.FAMILY, startDate, endDate);
        builder.defineStudyProgram(1, 10); // IDs de ejemplo
    }

    public void setBuilder(PlanBuilder newBuilder) {
        builder = newBuilder;
        builder.reset();
    }
}
