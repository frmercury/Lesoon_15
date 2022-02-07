package pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CaseResults {
    @SerializedName("entries")
    List<Entries> resultsList = new ArrayList<>();

    public List<Entries> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<Entries> resultsList) {
        this.resultsList = resultsList;
    }
}