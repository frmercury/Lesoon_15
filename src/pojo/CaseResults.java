package pojo;

import java.util.ArrayList;
import java.util.List;

public class CaseResults {
    List<Entries> resultsList = new ArrayList<>();

    public List<Entries> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<Entries> resultsList) {
        this.resultsList = resultsList;
    }
}