from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    wait = WebDriverWait(driver, timeout=10)

    cols = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/thead/tr/th")
    print("Number of columns: ", len(cols))
    
    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr")
    print("Number of rows: ", len(rows))

    cellValue = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]")
    print("Book name before sorting: ", cellValue.text)

    driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/thead/tr/th[5]").click()

    cellValue = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]")
    print("Book Name after sorting: ", cellValue.text)

    driver.quit