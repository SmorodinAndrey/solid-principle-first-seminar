package dip1.model.util;

import java.util.Collection;

import dip1.model.ReportItem;
import dip1.model.ReportManagerable;

public class DisplayPrinter implements ReportManagerable {
    public void output(Collection<ReportItem> items) {
        System.err.println("OUTPUT TO DISPLAY");
        for (ReportItem item : items) {
            System.out.format("DISPLAY %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}