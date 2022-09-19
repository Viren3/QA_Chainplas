package com.chainpal.Utilities.ExtendReport;

import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ExtentManager {

    private static ExtentReports extent;


    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            //Set date format
            DateFormat df = new SimpleDateFormat("dd_MMM_yyyy-HH_mm_ss");
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.home");
            extent = new ExtentReports("/Users/Viren/Work/Automation/old_chainpal_automation/chainpal_automation/QA_Chainplas/Reports/chainpal_ReportResults_" + df.format(System.currentTimeMillis()) + ".html");
            extent.addSystemInfo("Environment", "Chainpal DEV Environment");
            extent.loadConfig(new File("//Users/Viren/Work/Automation/old_chainpal_automation/chainpal_automation/QA_Chainplas/src/test/java/com/chainpal/Utilities/ExtendReport/extent-config.xml"));
        }
        return extent;
    }
}
