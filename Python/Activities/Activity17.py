import pandas as pd

data = {
    "Usernames" : ["admin", "Charles", "Deku"],
    "Passwords" : ["password", "Charl13", "AllMight"]
}

#Create the dataframe for the data set
dataframe = pd.DataFrame(data)

print(dataframe)

#writing the dataframe to csv
dataframe.to_csv("./sample.csv", index=False)

