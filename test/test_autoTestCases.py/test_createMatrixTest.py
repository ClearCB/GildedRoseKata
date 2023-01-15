from src.autoTestCases.createMatrixTest import createMatrixTest
from test_variables import first_day_items, first_day_array
import pytest

'''
This module will test the createMatrixTest rutines to get the matrix correctly
'''

@pytest.mark.test_createMatrixTest
def test_createMatrixTest():

    assert createMatrixTest(first_day_items) == first_day_array
