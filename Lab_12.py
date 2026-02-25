def linear_search(l: list, key: list) -> int:
    current = 1
    for i in range(0, len(l)):
        if l[i] == key:
            print('Linear Search: the key is found after ' + str(current) + ' comparisons.')
            return i
        current += 1
    
    print('Linear Search: the key is found after ' + str(current - 1) + ' comparisons.')
    return -1
        
def binary_search(l: list, key: list) -> int:
    low = 0
    high = len(l) - 1
    count = 1

    while low <= high:
        mid = int((low + high)/2)
        if l[mid] == key:
            print('Binear Search: the key is found after ' + str(count) + ' comparisons.')
            return mid
        if int((l[mid])[1]) > int(key[1]):
            high = mid - 1
            count += 1
        else:
            low = mid + 1
            count += 1

    print('Linear Search: the key is found after ' + str(count - 2) + ' comparisons.')
    return -1

def main():
    list = []
    file = open('customer_list.txt', 'r')
    for line in file:
        line = line.strip().split()
        list.append(line)

    key = ['Delilah', '4350600189']
    index = linear_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    index = binary_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    key = ['Zola', '2074980639']
    index = linear_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    index = binary_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    key = ['Reinaldo', '9988586038']
    index = linear_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    index = binary_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    key = ['CSE174', '1111111111']
    index = linear_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    print('')

    index = binary_search(list, key)
    print('The customer ' + str(key) + ' is located at index: ' + str(index) + '.')

    file.close()

    

if __name__=='__main__':
    main()