package au.edu.sydney.cpa.erp.feaa.reports;

import au.edu.sydney.cpa.erp.feaa.ValueObject.Data;
import au.edu.sydney.cpa.erp.ordering.Report;
import com.google.common.primitives.ImmutableDoubleArray;

import java.util.Arrays;
import java.util.Objects;

public class ReportImpl implements Report{

    private final String name;
    private final double commissionPerEmployee;
    private final Data legalData;
    private final Data cashFlowData;
    private final Data mergesData;
    private final Data tallyingData;
    private final Data deductionsData;

    public ReportImpl(String name,
                      double commissionPerEmployee,
                      double[] legalData,
                      double[] cashFlowData,
                      double[] mergesData,
                      double[] tallyingData,
                      double[] deductionsData) {
        this.name = name;
        this.commissionPerEmployee = commissionPerEmployee;
        this.legalData = new Data(legalData);
        this.cashFlowData = new Data(cashFlowData);
        this.mergesData = new Data(mergesData);
        this.tallyingData = new Data(tallyingData);
        this.deductionsData = new Data(deductionsData);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Report)){
            return false;
        }
        Report report = (Report) o;
        if (this.name.equals(report.getReportName())
                && this.commissionPerEmployee == report.getCommission()
                && this.legalData.getData() == report.getLegalData()
                && this.cashFlowData.getData() == report.getCashFlowData()
                && this.mergesData.getData() == report.getMergesData()
                && this.tallyingData.getData() == report.getTallyingData()
                && this.deductionsData.getData() == report.getDeductionsData()){

            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, commissionPerEmployee, legalData, cashFlowData, mergesData, tallyingData, deductionsData);
    }

    @Override
    public String getReportName() {
        return name;
    }

    @Override
    public double getCommission() {
        return commissionPerEmployee;
    }

    @Override
    public double[] getLegalData() {
        return legalData.getData();
    }

    @Override
    public double[] getCashFlowData() {
        return cashFlowData.getData();
    }

    @Override
    public double[] getMergesData() {
        return mergesData.getData();
    }

    @Override
    public double[] getTallyingData() {
        return tallyingData.getData();
    }

    @Override
    public double[] getDeductionsData() {
        return deductionsData.getData();
    }

    @Override
    public String toString() {

        return String.format("%s", name);
    }
}
