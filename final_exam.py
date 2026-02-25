def main():
    nums1 = [4.0, 8.9, 7.2, 1.0]
    nums_ends_ordered = order_ends(nums1)
    print(nums_ends_ordered)

    nums2 = [99.0, 96.3, 100.0]
    nums_ends_ordered = order_ends(nums2)
    print(nums_ends_ordered)

    nums3 = [65.7]
    nums_ends_ordered = order_ends(nums3)
    print(nums_ends_ordered)

    nums4 = []
    nums_ends_ordered = order_ends(nums4)
    print(nums_ends_ordered)

def order_ends(l: list) -> list:
    try:
        h = len(l) - 1
        if l[0] > l[h]:
            temp = l[h]
            l[h] = l[0]
            l[0] = temp
    except IndexError:
        l = l
    
    return l

if __name__=="__main__":
    main()