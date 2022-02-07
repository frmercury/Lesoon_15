package pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println(constructor.getCaseModel());

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(constructor.getCaseModel()));
    }

    public CaseResults getCaseModel() {
        Run run1 = new Run();
        run1.setBlocked_count(1);
        run1.setCompleted_on(null);
        run1.setConfig("Firefox, Ubuntu 12");

        List<Run> testList = new ArrayList<>();
        testList.add(run1);

        Runs testSet1 = new Runs();
        testSet1.setRunsList(testList);

        Entries entry = new Entries();
        entry.setId("3933d74b-4282-4c1f-be62-a641ab42706312");
        entry.setDescription("Deletion of elements");
        entry.setName("File deletion");
        entry.setRuns(testList);

        List<Entries> entriesList = new ArrayList<>();
        entriesList.add(entry);

        CaseResults caseResult = new CaseResults();
        caseResult.setResultsList(entriesList);

        return caseResult;
    }
}