def selection_sort(arr):
    """
    Sorts an array in ascending order using selection sort algorithm.
    
    Args:
        arr (list): The list of integers to be sorted
    """
    n = len(arr)
    for i in range(n - 1):
        # Find the minimum element in the unsorted portion
        min_idx = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        
        # Swap the found minimum element with the first element
        arr[i], arr[min_idx] = arr[min_idx], arr[i]


def main():
    """
    Main function to get user input and perform selection sort.
    """
    try:
        # Get the number of elements
        n = int(input("Enter the number of elements: "))
        
        # Input validation
        if n <= 0:
            print("Number of elements must be positive.")
            return
        
        # Get the array elements
        arr = []
        print(f"Enter {n} elements:")
        for i in range(n):
            element = int(input())
            arr.append(element)
        
        # Sort the array
        selection_sort(arr)
        
        # Display the sorted array
        print("Sorted array:")
        print(" ".join(map(str, arr)))
        
    except ValueError:
        print("Invalid input. Please enter integers only.")
    except Exception as e:
        print(f"An error occurred: {e}")


if __name__ == "__main__":
    main()
