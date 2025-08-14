import pytest

"""
Sum of two numbers
Difference of two numbers
Product of two numbers
Quotient of two numbers
"""

def test_sum():
    num1 = 70
    num2 = 10
    sum = num1 + num2
    assert sum == 80


def test_sub():
    num1 = 70
    num2 = 10
    diff = num1 - num2
    assert diff == 60

@pytest.mark.activity
def test_multiply():
    num1 = 70
    num2 = 10
    product = num1 * num2
    assert product == 700

@pytest.mark.activity
def test_division():
    num1 = 70
    num2 = 10
    division = num1 / num2 
    assert division == 7