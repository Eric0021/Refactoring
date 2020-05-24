package au.edu.sydney.cpa.erp.feaa.FlyWeight;

import au.edu.sydney.cpa.erp.feaa.reports.ReportDatabase;
import au.edu.sydney.cpa.erp.ordering.Report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReportFactory {
    private static final List<Report> reportsList = new ArrayList<>();
    private static boolean initialised = false;

    public static List<Report> getReports(){
        return reportsList;

    }

    public static void retrieveAllReports(){
        // only add each report type once.
        List<Report> reports = new ArrayList<>(ReportDatabase.getTestReports());
        for(Report report: reports){
            if(!reportsList.contains(report)){
                reportsList.add(report);
            }
        }
        initialised = true;
    }

    public static boolean isInitialised() {
        return initialised;
    }
}
