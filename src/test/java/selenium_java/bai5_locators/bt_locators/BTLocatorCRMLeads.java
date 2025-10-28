package selenium_java.bai5_locators.bt_locators;

public class BTLocatorCRMLeads {
    String url = "https://crm.anhtester.com/admin/authentication";
    //locator for login page
    String headerLoginPage = "//h1[normalize-space()='Login']";
    String inputEmail = "//input[@id='email']";
    String inputPassword = "//input[@id='password']";
    String buttonLogin = "//button[normalize-space()='Login']";
    String checkboxRememberMe = "//input[@id='remember']";
    String labelRememberMe = "//label[@for='remember']";
    String linkForgetPassword = "//a[normalize-space()='Forgot Password?']";
    String alerErrorMessage = "//div[contains(@class,'alert-danger')]";
    String alerErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";
    String alerErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";
    //locator for Menu
    String menuTasks = "//span[@class='menu-text' and normalize-space()='Tasks']";
    String menuLeads = "//span[@class='menu-text' and normalize-space()='Leads']";
    //locator for Leads Page
    String urlLeads = "https://crm.anhtester.com/admin/leads";
    String buttonNewLead = "//a[normalize-space()='New Lead']";
    String buttonLeadSummary = "//a[@data-title='Leads Summary']";
    String headerLeadsSummary = "//h4[normalize-space()='Leads Summary']";
    String labelActive = "//span[normalize-space()='Active']";
    String labelActiveNumber = "//div[@id='wrapper']/div/div/div/div[1]/div[3]/div/div[1]/span[1]";
    //String labelActiveNumber = "//span[normalize-space()='Active']/preceding-sibling::span";
    String labelJjjj = "//span[normalize-space()='jjjj']";
    String labelJjjjNumber = "////div[@id='wrapper']/div/div/div/div[1]/div[3]/div/div[2]/span[1]";
    //String labelJjjjNumber = "//span[normalize-space()='jjjj']/preceding-sibling::span";
    String labelCustomer = "//span[normalize-space()='Customer']";
    String labelCustomerNumber = "////div[@id='wrapper']/div/div/div/div[1]/div[3]/div/div[3]/span[1]";
    //String labelCustomerNumber = "//div[@style='display: block;']/descendant::span[normalize-space()='Customer']/preceding-sibling::span";
    String labelLostLeads = "//span[normalize-space()='Lost Leads']";
    String labelLostLeadsNumber = "////div[@id='wrapper']/div/div/div/div[1]/div[3]/div/div[4]/span[1]";
    //String labelLostLeadsNumber = "//div[@style='display: block;']/descendant::span[normalize-space()='Lost Leads']/preceding-sibling::span";
    String buttonLeadKanban = "//a[@data-title='Switch to Kanban']";
    String inputSearchLead = "//div[@id='leads_filter']//input[@type='search']";
    String inputLeadLength = "//div[@id='leads_length']//select[@name='leads_length']";
    String buttonExport = "//button[normalize-space()='Export']";
    String buttonBulkActions = "//button[normalize-space()='Bulk Actions']";
    String buttonReload = "//button[@title='Reload']";
    //locator for Leads table
    //header
    String rowHead = "////tr[@role='row']";
    String inputCheckbox = "//input[@id='mass_select_all']";
    String labelSTT = "//th[@id='th-number']";
    String labelName = "//th[@id='th-name']";
    String labelCompany = "//th[@id='th-company']";
    String labelEmail = "//th[@id='th-email']";
    String labelPhone = "//th[@id='th-phone']";
    String labelValue = "//th[@id='th-lead-value']";
    String labelTags = "//th[@id='th-tags']";
    String labelAssigned = "//th[@id='th-assigned']";
    String labelStatus = "//th[@id='th-status']";
    String labelSource = "//th[@id='th-source']";
    String labelLastContact = "//th[@id='th-last-contact']";
    String labelCreated = "//th[@id='th-date-created']";
    //body
    String rowBody = "//tr[@id='lead_246']";
    String iconView = "//tr[@id='lead_246']//a[normalize-space()='View']";
    String iconEdit = "//tr[@id='lead_246']//a[normalize-space()='Edit']";
    String iconDelete = "//tr[@id='lead_246']//a[normalize-space()='Delete']";
    String buttonPrevious = "//div[@id='leads_paginate']//a[normalize-space()='Previous']";
    String buttonNumber = "//div[@id='leads_paginate']/ul/li[2]/a";
    String buttonNext = "//div[@id='leads_paginate']//a[text()='Next']";
}
