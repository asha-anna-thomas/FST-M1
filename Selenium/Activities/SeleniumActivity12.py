from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-content")
    print(driver.title)
    wait = WebDriverWait(driver, timeout=10)

    driver.find_element(By.ID, "genButton").click()
    if wait.until(expected_conditions.text_to_be_present_in_element((By.ID, "word"), "release")):
        print(driver.find_element(By.ID, "word").text)

           
    driver.quit