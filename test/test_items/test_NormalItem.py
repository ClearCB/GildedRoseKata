from src.Items.NormalItem import *
import pytest

'''
This module will check an unitary test from the NormalItem class.
'''

@pytest.fixture
def mouse():

    test_mouse = NormalItem("Mouse", 5, 10)

    return test_mouse

# We will test the method that change the quality itself.
@pytest.mark.test_setQuality
def test_setQuality(mouse):

    assert mouse.quality == 10

    mouse.setQuality(+2)

    # Check if added correctly
    assert mouse.quality == 12

    mouse.setQuality(-2)

    # Check if removed correctly
    assert mouse.quality == 10

    mouse.quality = 60

    mouse.setQuality(+1)

    # Check if cannot be more than 50
    assert mouse.quality == 50

    mouse.quality = 1

    mouse.setQuality(-2)

    # Check if cannot be less than 0
    assert mouse.quality == 0

# We will test the method that update the quality.