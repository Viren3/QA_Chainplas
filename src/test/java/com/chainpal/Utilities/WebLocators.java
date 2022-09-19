package com.chainpal.Utilities;

public interface WebLocators {

    interface loginPageLocators {
        String emailAddressTextBox = "//input[@id='mat-input-0']";
        String enterPasswordTextBox = "//input[@id='mat-input-1']";
        String clickOnLoginButton = "//button[@class='mat-focus-indicator btn-global mat-button mat-button-base']";
        String loginHeaderText = "//h2[normalize-space()='Login']";
    }

    interface logoutPageLocators {
        String toggleDropdown = "//input[@formcontrolname='email']";
        String signOutButton = "//input[@formcontrolname='password']";
    }
}
