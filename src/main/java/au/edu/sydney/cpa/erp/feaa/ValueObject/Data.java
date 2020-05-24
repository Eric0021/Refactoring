package au.edu.sydney.cpa.erp.feaa.ValueObject;

import com.google.common.primitives.ImmutableDoubleArray;

public class Data {

    private final ImmutableDoubleArray array;

    public Data(double[] array) {
        if(array != null){
            this.array = ImmutableDoubleArray.copyOf(array);
        }else{
            this.array = null;
        }
    }

    public double[] getData(){
        if(array == null){
            return null;
        }
        return this.array.toArray();
    }
}
