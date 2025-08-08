from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions


with webdriver.Chrome() as driver:
    wait = WebDriverWait(driver, timeout=10)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/alerts")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find and click the button to open the alert
    driver.find_element(By.ID, "simple").click()

    # Switch focus to the alert
    simpleAlert = wait.until(expected_conditions.alert_is_present())

    # Print the text in the alert
    alertText = simpleAlert.text
    print("Text in alert: " + alertText)

    # Close the alert by clicking OK
    simpleAlert.accept()

    # Print the message
    print(driver.find_element(By.ID, "result").text)
    
    

    driver.quit