package dip1.model;

import java.util.Collection;

public interface ReportManagerable {
    void output(Collection<ReportItem> items);
}