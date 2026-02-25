# Starter code for Project 2

# Global variable to hold previous lines for calculations that require them

def main():
    # Get user input for file name
    print('Enter input file name: ', end='')
    filename = input()
    # Open the file
    file = open(filename, 'r')
    previous = 0
    count = 1

    # Nested loops for reading the file, breaking it down
    # to individual pieces, and going through each item
    # of the line one at a time. For each item, you check
    # if it is a digit (i.e., there are only digits 0-9 with
    # no spaces in the String) and print an empty String as
    # a result. **You need to update this and complete the
    # project from here**.

    for line in file:
        try:
            line = line.strip().split()
            line = list(line)
            if line[0] == '+':
                h = 2
                total = int(line[1])
                try:
                    for n in line:
                        total += int(line[h])
                        h += 1
                except IndexError:
                    true = True
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
        except ValueError:
            print('Result of Line ' + str(count) + ': Non-integer input on this Line')
            count += 1
            previous = 0

        if line[0] == '-':
            try:
                h = 2
                total = int(line[1])
                try:
                    for n in line:
                        total -= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0

        if line[0] == '':
            try:
                h = 2
                total = int(line[1])
                try:
                    for n in line:
                        total -= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0

        if line[0] == '*':
            try:
                h = 2
                total = int(line[1])
                try:
                    for n in line:
                        total *= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0

        if line[0] == '/':
            try:
                h = 2
                total = int(line[1])
                try:
                    for n in line:
                        total /= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0
            except ZeroDivisionError:
                print('Result of Line ' + str(count) + ': Error: / by zero')
                count += 1
                previous = 0

        if line[0] == '<+':
            try:
                h = 1
                total = previous
                try:
                    for n in line:
                        total += int(line[h])
                        h += 1
                except IndexError:
                    true = True
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0

        if line[0] == '<':
            try:
                h = 1
                total = previous
                try:
                    for n in line:
                        total -= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0


        if line[0] == '<-':
            try:
                h = 1
                total = previous
                try:
                    for n in line:
                        total -= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0

        if line[0] == '<*':
            try:
                h = 1
                total = previous
                try:
                    for n in line:
                        total *= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0

        if line[0] == '</':
            try:
                h = 1
                total = previous
                try:
                    for n in line:
                        total /= int(line[h])
                        h += 1
                except IndexError:
                    true = True
                total = int(total)
                print('Result of Line ' + str(count) + ': ' + str(total))
                count += 1
                previous = total
            except ValueError:
                print('Result of Line ' + str(count) + ': Non-integer input on this Line')
                count += 1
                previous = 0
            except ZeroDivisionError:
                print('Result of Line ' + str(count) + ': Error: / by zero')
                count += 1
                previous = 0

        elif line[0].isdigit() == True:
            print('Result of Line ' + str(count) + ': No operator ' + str(line))
            count += 1
            previous = 0





if __name__=="__main__":
    main()