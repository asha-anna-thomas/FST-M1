from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    print(driver.title)

    actions = ActionChains(driver)

    cargoLock = driver.find_element(By.XPATH, "//*[@id=\"stage\"]/div/div[1]/div/h1")
    cargoToml = driver.find_element(By.XPATH, "//*[@id=\"stage\"]/div/div[2]/div/h1")
    actions.click(cargoLock).pause(1).move_to_element(cargoToml).pause(5).click(cargoToml).perform()
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)

    srcbutton = driver.find_element(By.XPATH, "//*[@id=\"stage\"]/div/div[3]/div/h1")
    targetbutton = driver.find_element(By.XPATH, "//h1[text()='target']")
    actions.double_click(srcbutton).pause(3).pause(5).context_click(targetbutton).pause(3).perform()

    menuOption = driver.find_element(By.XPATH, "//div[@id='menu']/div/ul/li[1]")
    actions.click(menuOption).pause(5).perform()
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)


    driver.quit