from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events")
    print(driver.title)

    actions = ActionChains(driver)

    actions.send_keys("hello world").perform()
    message = driver.find_element(By.CSS_SELECTOR, "h1.mt-3").text
    print(message)
    
    driver.quit