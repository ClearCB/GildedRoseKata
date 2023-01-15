from src.autoTestCases.createMatrixTest import createMatrixTest
from test_variables import items, first_day_array, second_day_array, matrix_items
import pytest

'''
This module will test the createMatrixTest rutines to get the matrix correctly
'''

@pytest.mark.test_createMatrixTest
def test_createMatrixTest():

    assert createMatrixTest(items)[0] == first_day_array
    assert createMatrixTest(items)[1] == second_day_array
    assert createMatrixTest(items) == first_day_array
    assert createMatrixTest(items) == matrix_items
