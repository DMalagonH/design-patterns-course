package course.designpatterns.builder.entities;

import java.time.LocalDate;

public class Accommodation {
    private AccommodationType accommodationType;
    private LocalDate startDate;
    private LocalDate endDate;

    public Accommodation(AccommodationType accommodationType, LocalDate startDate, LocalDate endDate) {
        this.accommodationType = accommodationType;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
