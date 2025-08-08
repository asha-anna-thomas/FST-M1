from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    wait = WebDriverWait(driver, timeout=10)

    visible = driver.find_element(By.ID, "checkbox").is_displayed()
    print(visible)

    driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']").click()
    wait.until(expected_conditions.invisibility_of_element(driver.find_element(By.ID, "checkbox")))

    visible = driver.find_element(By.ID, "checkbox").is_displayed()
    print(visible)

    driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']").click()
    wait.until(expected_conditions.element_to_be_clickable(driver.find_element(By.ID, "checkbox"))).click()

    selected = driver.find_element(By.ID, "checkbox").is_selected()
    print(selected)

       
    driver.quit