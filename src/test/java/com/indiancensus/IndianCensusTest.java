package com.indiancensus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndianCensusTest {
    private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\ASUS\\IdeaProjects\\IndianCensusAnalyser\\src\\main\\resources\\IndianStateCensusData.csv";
    public IndianCensusAnalyser analyser;

    @Test
    public void returnSize() throws Exception {
        try {
            analyser = new IndianCensusAnalyser();
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqual() throws Exception {
        try {
            analyser = new IndianCensusAnalyser();
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetected() throws Exception {
        try {
            analyser = new IndianCensusAnalyser();
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrect() throws Exception {
        try {
            analyser = new IndianCensusAnalyser();
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturCustomException_ifCSVHeaderIncorrect() throws Exception {
        try {
            analyser = new IndianCensusAnalyser();
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }


}
