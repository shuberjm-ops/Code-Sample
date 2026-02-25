def sort1(l: list):
    for i in range(1, len(l)):
        temp = l[i]
        j = i
        while j > 0 and l[j - 1][1] > temp[1]:
            l[j] = l[j - 1]
            j -= 1
        l[j] = temp

def sort2(l: list):
    for i in range(1, len(l)):
        temp = l[i]
        j = i
        while j > 0 and l[j - 1][3] > temp[3]:
            l[j] = l[j - 1]
            j -= 1
        l[j] = temp

def main():
    sort = False
    while True:
        print('1. Load from a file')
        print('2. Print from a loaded list')
        print('3. Sort the list based on shipment IDs')
        print('4. Sort the list based on the tracking numbers')
        print('5. Print the sorted list')
        print('6. Exit')
        print('Enter a number[1-6]: ', end='')
        choice = str(input())
        if choice == '1':
            print('Enter the name of the file: ', end='')
            file = str(input())
            file = open(file, 'r')
            l = []
            for line in file:
                line = line.strip().split()
                l.append(line)
            print('Loading from the file is done!')
        if choice == '2':
            print('**** Printing the list ****')
            i = 0
            while True:
                h = 0
                while h < 10:
                    print(l[i])
                    i += 1
                    h += 1
                print('Enter something to continue/enter s to stop: ', end='')
                c = str(input())
                if c == 's':
                    break
                else:
                    true = True
        if choice == '3':
             sort1(l)
             sort = True
        if choice == '4':
            sort2(l)
            sort = True
        if choice == '5':
            if sort == True:
                print('**** Printing the list ****')
                i = 0
                while True:
                    h = 0
                    while h < 10:
                        print(l[i])
                        i += 1
                        h += 1
                    print('Enter something to continue/enter s to stop: ', end='')
                    c = str(input())
                    if c == 's':
                        break
                    else:
                        true = True
                break
            else:
                print('Nothing sorted yet!')

        print(' ')



if __name__=='__main__':
    main()