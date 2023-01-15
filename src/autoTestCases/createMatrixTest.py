'''
This module will create the matrix of test cases to check that our
class update the items correctly
'''


'''
First we create a rutine that after passing the information at a file
and read the lines to store all the information in a matrix. 
'''
def createMatrixTest(file):

    matrix_test_cases = []
    day_items_to_append = []

    for line in file:

        if line.find("-----"):

            day_items_to_append = []
        
        elif line.find("\n"):

            matrix_test_cases.append(day_items_to_append)


