package ml.littlebulb.presto.kudu.properties;

import java.util.List;

public class RangePartitionDefinition {
    private List<String> columns;

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }
}
