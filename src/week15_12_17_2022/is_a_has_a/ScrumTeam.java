package week15_12_17_2022.is_a_has_a;

public class ScrumTeam {
    //Scrum Team HAS A Tester
    Tester tester;
    //Scrum Team HAS A Developer
    Developer developer;

    public ScrumTeam(Tester tester, Developer developer) {
        this.tester = tester;
        this.developer = developer;
    }
}
