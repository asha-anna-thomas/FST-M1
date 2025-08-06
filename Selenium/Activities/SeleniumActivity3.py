from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/login-form")
    print(driver.title)
    driver.find_element(By.XPATH,"//input[@id='username']").send_keys("admin")
    driver.find_element(By.XPATH,"//input[@id='password']").send_keys("password")
    driver.find_element(By.XPATH,"//button[contains(@class, \"svelte-1pdjkmx\")]").click()
    
    mess = driver.find_element(By.XPATH, "//h1[contains(@class, \"text-center\")]")
    
    print(mess.text)
    driver.quit 