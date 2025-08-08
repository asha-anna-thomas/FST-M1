from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    wait = WebDriverWait(driver, timeout=10)

    cols = driver.find_elements(By.XPATH, "//table[contains(@class, \"table-auto\")]/thead/tr/th")
    print(len(cols))

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, \"table-auto\")]/tbody/tr")
    print(len(rows))

    thirdRow = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[3]/td")
    print("Third row cell values: ")
    
    for cell in thirdRow:
        print(cell.text)
    
    cellValue = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]")
    print("Second row, second cell value: ", cellValue.text)

           
    driver.quit