package com.example.takehomedemo.utils;

import com.example.takehomedemo.model.PlayerModel;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import java.io.InputStream;
import java.util.List;

public class CsvParserUtils {
    private BeanListProcessor<PlayerModel> rowProcessor;

    public CsvParserUtils() {
        rowProcessor = new BeanListProcessor<PlayerModel>(PlayerModel.class);
    }

    public List<PlayerModel> parseCsv(InputStream inputStream) {
        CsvParserSettings settings = getCsvParserSettings();
        CsvParser parser = new CsvParser(settings);
        parser.parse(inputStream);
        return rowProcessor.getBeans();
    }

    private CsvParserSettings getCsvParserSettings() {
        CsvParserSettings settings = new CsvParserSettings();
        settings.setHeaderExtractionEnabled(true);
        settings.setProcessor(rowProcessor);
        settings.getFormat().setLineSeparator("\n");

        //turning off features enabled by default
        settings.getFormat().setLineSeparator("\n");
        settings.setIgnoreLeadingWhitespaces(false);
        settings.setIgnoreTrailingWhitespaces(false);
        settings.setSkipEmptyLines(false);
        settings.setColumnReorderingEnabled(false);
        return settings;
    }

}
