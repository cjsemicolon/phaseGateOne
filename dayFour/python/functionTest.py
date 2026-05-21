import unittest

from function import collect_input

class TestAdditionToNumber(unittest.TestCase):

    def test_that_the_array_function_works(self):

        input_array = [8, 6, 12, 4, -2]

        number = 6

        expected = [8, -2]

        actual = collect_input(input_array, number)

        self.assertEqual(expected, actual)

    


