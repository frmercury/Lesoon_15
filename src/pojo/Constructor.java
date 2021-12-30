package pojo;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println(constructor.getCaseModel());
    }

    public CaseResults getCaseModel() {
        Run run = new Run();
        run.setBlocked_count(1);
        run.setCompleted_on(null);
        run.setConfig("Firefox, Ubuntu 12");

        List<Run> runList = new ArrayList<>();
        runList.add(run);

        Runs runs = new Runs();
        runs.setRunsList(runList);


        Entries entr = new Entries();
        entr.setId("3933d74b-4282-4c1f-be62-a641ab42706312");
        entr.setDescription("Delete");
        entr.setName("File Deletion");
        entr.setRuns(runs);

        List<Entries> entriesList = new ArrayList<>();
        entriesList.add(entr);

        CaseResults caseResult = new CaseResults();
        caseResult.setResultsList(entriesList);

        return caseResult;

    }
}
