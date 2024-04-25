import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Coder {
    private String specialization;
    private String language;
    private int yearOfExperience;

    public Coder(String specialization, String language, int yearOfExperience) {
        this.specialization = specialization;
        this.language = language;
        this.yearOfExperience = yearOfExperience;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public String getLanguage() {
        return language;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Company {
    private List<Coder> coders;

    public Company() {
        coders = new ArrayList<>();
    }

    public void hireCoder(Coder coder) {
        coders.add(coder);
    }

    public void fireCoder(Coder coder) {
        coders.remove(coder);
    }

    public List<Coder> getCoders() {
        return Collections.unmodifiableList(this.coders);
    }
}

public class Programmer {

    public static void main(String[] args) {
        Coder James = new Coder("Data Scientist", "Python and Java", 3);
        Coder Clementine = new Coder("Software Engineer", "PHP and Java", 5);
        Coder Jack = new Coder("Software Engineer", "Javascript and Java", 4);
        Company rhr = new Company();
        rhr.hireCoder(James);
        rhr.hireCoder(Clementine);
        rhr.hireCoder(Jack);

        // Printing list of coders
        List<Coder> coders = rhr.getCoders();
        for (Coder coder : coders) {
            System.out.println("Specialization: " + coder.getSpecialization() + ", Language: " + coder.getLanguage() + ", Experience: " + coder.getYearOfExperience());
        }
    }
}
