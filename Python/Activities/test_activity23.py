import pytest

@pytest.mark.activity
def test_sum(num_list): #num_list is the fixture name, that is there in conftest.py
    sum = 0
    for num in num_list:
        sum += num
        print(sum)
    assert sum == 55