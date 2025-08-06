from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)

    checkboxelement = driver.find_element(By.ID, "checkbox")
    ifselected = checkboxelement.is_selected()
    print(ifselected)

    checkboxelement.click()
    ifselected = checkboxelement.is_selected()
    print(ifselected)
    
    driver.quit