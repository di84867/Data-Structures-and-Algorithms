def is_palindrome(s):
    l, r = 0, len(s) - 1
    while l < r:
        if s[l] != s[r]:
            return False
        l += 1
        r -= 1
    return True

if __name__ == "__main__":
    input_str = input("Enter a string: ")
    if is_palindrome(input_str):
        print("Palindrome")
    else:
        print("Not a palindrome")
