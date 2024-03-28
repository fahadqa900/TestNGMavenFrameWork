package com.metlife.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils
{
    static XSSFWorkbook wb;
    static XSSFSheet sh;

    public ExcelUtils(String excelpath) throws IOException
    {
        File f = new File(excelpath);
        FileInputStream fis = new FileInputStream(f);
        wb = new XSSFWorkbook(fis);
    }

    public String getData(int SheetNumber, int row, int column)
    {
        sh = wb.getSheetAt(SheetNumber);
        String str = sh.getRow(row).getCell(column).getStringCellValue();
        return str;
    }

    public int getRowCount(int index)
    {
        int count = wb.getSheetAt(index).getLastRowNum();
        count = count + 1;
        return count;
    }
}

