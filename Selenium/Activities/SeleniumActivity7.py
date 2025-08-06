from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)

    ifenabled = driver.find_element(By.ID, "textInput").is_enabled()
    print(ifenabled)

    driver.find_element(By.ID, "textInputButton").click()
    ifenabled = driver.find_element(By.ID, "textInput").is_enabled()
    print(ifenabled)
    
    driver.quit