package com.mars.scheduling.service;

import com.mars.scheduling.entity.Card;
import com.mars.scheduling.repository.CardRepository;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.util.List;


@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public void exportExcel() {
        System.out.println("ok");
        long startTime = System.currentTimeMillis();
        List<Card> cards = cardRepository.findAll();
        SXSSFWorkbook workbook = new SXSSFWorkbook();

        // Tạo sheet
        Sheet sheet = workbook.createSheet("Cards");

        // Tạo font và style cho header
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 12);
        headerFont.setColor(IndexedColors.WHITE.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        headerCellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
        headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerCellStyle.setAlignment(HorizontalAlignment.CENTER);

        // Tạo header row
        Row headerRow = sheet.createRow(0);
        String[] columnHeaders = {"Card ID", "Card Number", "Customer ID", "Card Type", "Total Limit", "Amount Used",  "Create Date"};

        for (int i = 0; i < columnHeaders.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columnHeaders[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Tạo dữ liệu
        int rowNum = 1;
        for (Card card : cards) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(card.getCardId());
            row.createCell(1).setCellValue(card.getCardNumber());
            row.createCell(2).setCellValue(card.getCustomerId());
            row.createCell(3).setCellValue(card.getCardType());
            row.createCell(4).setCellValue(card.getTotalLimit());
            row.createCell(5).setCellValue(card.getAmountUsed());
            row.createCell(6).setCellValue(card.getCreateDt() != null ? card.getCreateDt().toString() : "");
        }


        // Ghi dữ liệu ra file Excel
        try (FileOutputStream outputStream = new FileOutputStream("large_file.xlsx")) {
            workbook.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Giải phóng tài nguyên
            workbook.dispose();
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
