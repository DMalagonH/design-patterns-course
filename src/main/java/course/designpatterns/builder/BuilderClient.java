package course.designpatterns.builder;

public class BuilderClient {
    public static void main(String[] args) {
        LocalPlanBuilder localPlanBuilder = new LocalPlanBuilder();
        Director director = new Director(localPlanBuilder);

        director.constructMBAPlan();

        LocalPlan localPlan = localPlanBuilder.getPlan();

        InternationalPlanBuilder internationalBuilder = new InternationalPlanBuilder();

        director.setBuilder(internationalBuilder);

        director.constructMBAPlan();

        InternationalPlan internationalPlan = internationalBuilder.getPlan();

        System.out.println(localPlan);
        System.out.println(internationalPlan);
    }
}
