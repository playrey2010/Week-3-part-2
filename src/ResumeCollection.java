import java.util.ArrayList;
import java.util.Scanner;

public class ResumeCollection {
    private ArrayList<Resume> resumes;

    public ArrayList<Resume> getResumes() {
        return resumes;
    }

    public void setResumes(ArrayList<Resume> resumes) {
        this.resumes = resumes;
    }

    public void inputResumes (Scanner sc) {
        ArrayList<Resume> tempResumes = new ArrayList<>();
        Resume resume;
        String again = "n";
        do {
            resume = new Resume();
            resume.inputResumeInformation(sc);
            tempResumes.add(resume);
        } while ()
    }
}
