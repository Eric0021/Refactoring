package au.edu.sydney.cpa.erp.feaa.Critical;

public class RegularOrder implements Critical {
    @Override
    public double getCriticalLoading() {
        return 0;
    }

    @Override
    public boolean isCritical() {
        return false;
    }
}
