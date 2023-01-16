from src.Items.AgedBrie import *
import pytest

'''
Unitary test to check if Aged Brie quality has the correct behaviour
'''

# Using a fixture to interact correctly with the class AgedBrie
@pytest.fixture
def cheese():
    
    test_cheese = AgedBrie("Cheese", 5, 10)

    return test_cheese


# Test the method that update the 