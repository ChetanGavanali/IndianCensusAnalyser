package com.indiancensus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndianCensusTest {
    private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\ASUS\\IdeaProjects\\IndianCensusAnalyser\\src\\main\\resources\\IndianStateCensusData.csv";
    IndianCensusAnalyser analyser=new IndianCensusAnalyser();
    private static final String INDIAN_CSV_STATE_PATH = "C:\\Users\\ASUS\\IdeaProjects\\IndianCensusAnalyser\\src\\main\\resources\\StateCode";
    @Test
    public void returnSize() throws Exception {
        try {
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqual() throws Exception {
        try {
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetected() throws Exception {
        try {
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrect() throws Exception {
        try {
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturCustomException_ifCSVHeaderIncorrect() throws Exception {
        try {
            Assertions.assertEquals(27, analyser.loadCensusData(INDIA_CENSUS_CSV_FILE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }


//	State

    @Test
    public void returnSizeState() throws Exception {
        try {

            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldExecuteProperly_IfRecordsAreEqualState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnRecordsif_CSVFileIsDetectedState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData("xyz.csv"));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnCustomException_ifDelimiterIncorrectState() throws Exception {
        try {

            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldRetureCustomException_ifCSVHeaderIncorrectState() throws Exception {
        try {
            Assertions.assertEquals(37, analyser.loadStateData(INDIAN_CSV_STATE_PATH));
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }

}
