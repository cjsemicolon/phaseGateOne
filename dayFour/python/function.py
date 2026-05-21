#//write a function that takes in an array and an integer and outputs an array of numbers that when added up would produce the integer collected with the array.
#//input{8,6,12,4,-2}, 6 and {1,2,5,7,6,8,9}, 12
#//
#//write a function to collect the numbers
#//write 2 loops(loop 1 to pick a number and loop 2 to pick the number after it.)
#//return the new array

def collect_input(numbers, integer):
    count = 0

    array = []

    for index in range(len(numbers)):

        for digit in range(index, len(numbers)):

            if numbers[index] + numbers[digit] == integer:

                array = [numbers[index], numbers[digit]]

    return array


