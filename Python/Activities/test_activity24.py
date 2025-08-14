import pytest

@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18)])
def test_balance(wallet, earned, spent, expected):
    #add the earned amount to the wallet
    wallet += earned

    #subtract the spend amount from the wallet
    wallet -= spent

    #assert the remaining balance
    assert wallet == expected