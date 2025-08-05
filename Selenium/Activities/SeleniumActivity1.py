from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/")
    print(driver.title)
    driver.find_element(By.LINK_TEXT, "About Us").click
    print(driver.title)