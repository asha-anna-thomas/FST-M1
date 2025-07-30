import pandas as pd
from pandas import ExcelWriter

data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

#conver tot datafram
dataframe = pd.DataFrame(data)

print(dataframe)

#writing files to excel file
df_writer = ExcelWriter("./sample.xlsx")
dataframe.to_excel(df_writer, sheet_name = 'Sheet1', index=False)
df_writer.close()