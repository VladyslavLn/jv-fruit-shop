package service.impl;

import java.util.Map;
import model.Fruit;
import service.ReportService;
import storage.Storage;

public class ReportServiceImpl implements ReportService {
    @Override
    public String createReport() {
        StringBuilder stringBuilder = new StringBuilder("fruit,quantity")
                .append(System.lineSeparator());
        for (Map.Entry<Fruit, Integer> report : Storage.storage.entrySet()) {
            stringBuilder.append(report.getKey())
                    .append(",")
                    .append(report.getValue())
                    .append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
