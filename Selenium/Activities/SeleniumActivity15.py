from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    wait = WebDriverWait(driver, timeout=10)

    driver.find_element(By.XPATH, "//input[starts-with(@id, 'full-name')]").send_keys("asha")
    driver.find_element(By.XPATH, "//input[contains(@id, '-email')]").send_keys("test@test.com")
    driver.find_element(By.XPATH, "//input[contains(@name, '-event-date-')]").send_keys("08/08/2025")
    driver.find_element(By.XPATH, "//textarea[contains(@id, '-additional-details-')]").send_keys("This is test text")
    driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    message = wait.until(expected_conditions.visibility_of_element_located((By.ID, "action-confirmation"))).text
    print("Success message: ", message)

    driver.quit