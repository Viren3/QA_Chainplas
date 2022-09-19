package com.chainpal.Utilities;
import java.awt.datatransfer.Clipboard;
import java.awt.event.InputEvent;
import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {

    private WebDriver driver;

    public void imageUpload() throws AWTException, InterruptedException {

        //StringSelection ss = new StringSelection(System.getProperty("user.dir") + "\\Data\\" + fileName + "");
        //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //*****
        //StringSelection strSelection = new StringSelection("/Users/Viren/Firefox_logo,_2019.png");
        //Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //clipboard.setContents(strSelection, null);
        //StringSelection stringSelection = new StringSelection("/Users/Viren/Firefox_logo,_2019.png");
        //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        File file = new File("/Users/Viren/Firefox_logo,_2019.png");
        StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        //Paste the clipboard value

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        //Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // drag
        //robot.mouseMove(100, 100);
        //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        // drop
        //robot.mouseMove(100, 100);
        //robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);


        //robot.keyPress(KeyEvent.VK_META);
        //robot.keyPress(KeyEvent.VK_SHIFT);
        //robot.keyPress(KeyEvent.VK_G);
        //robot.keyRelease(KeyEvent.VK_G);
        //robot.keyRelease(KeyEvent.VK_SHIFT);
        //robot.keyRelease(KeyEvent.VK_META);

        // Paste the clipBoard content - Command ⌘ + V.
        //robot.keyPress(KeyEvent.VK_META);
        //robot.keyPress(KeyEvent.VK_V);
        //robot.keyRelease(KeyEvent.VK_V);
        //robot.keyRelease(KeyEvent.VK_META);

        // Press Enter (GO - To bring up the file.)
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);
        //*****

    }
}