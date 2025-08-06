from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)

    visible = driver.find_element(By.ID, "checkbox").is_displayed()
    print(visible)
    
    driver.find_element(By.XPATH, "//button[text()=\"Toggle Checkbox\"]").click()
    visible = driver.find_element(By.ID, "checkbox").is_displayed()
    print(visible)
    
    driver.quit