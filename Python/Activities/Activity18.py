import pandas as pd

df_read = pd.read_csv("./sample.csv")
print(df_read)

print(df_read["Usernames"])

print(df_read["Usernames"][1], df_read["Passwords"][1])

print(df_read.sort_values("Usernames"))

print(df_read.sort_values("Passwords", ascending=False))