from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/target-practice")
    print(driver.title)
    third_header = driver.find_element(By.XPATH, "//h3[contains(@class, 'text-orange-600')]").text
    print(third_header)
    fifth_color = driver.find_element(By.XPATH, "//h5[contains(@class, 'text-purple-600')]").value_of_css_property("color")
    print(fifth_color)
    purple_class = driver.find_element(By.CSS_SELECTOR, "button.text-purple-900").get_attribute("class")
    print(purple_class)
    slate_text = driver.find_element(By.XPATH, "//button[contains(@class, 'slate')]").text
    print(slate_text)
    driver.quit 