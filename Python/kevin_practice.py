#   1
#   Define method that finds that factorial of n
#   return type: integer
#   eg. factorial(5) == 5*4*3*2*1 == 120

def factorial(n):
    # code
    return "place holder"

print("factorial(5) == 120: " + str(factorial(5) == 120))
print("factorial(0) == 1: " + str(factorial(0) == 1))

#   2
#   Define method that checks if n is a prime number
#   prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, ............
#   return type: boolean
#   eg. is_prime(13) == true

def is_prime(n):
    # code
    return "place holder"

print("is_prime(0) == false: " + str(is_prime(0) == False))
print("is_prime(13) == false: " + str(is_prime(13) == True))

#   3
#   Define a method that finds the nth prime number
#   return type: integer
#   eg. find_nth_prime(3) = 5
#   hint: Use is_prime that you wrote in the previous problem to help

def find_nth_prime(n):
    # code
    return "place holder"

print("find_nth_prime(1) == 2: " + str(find_nth_prime(1) == 2))
print("find_nth_prime(7) == 17: " + str(find_nth_prime(7) == 17))

#   4
#   Define a method that converts a string into pig latin
#   return type: string
#   eg. pig_latinify("hello") == "ellohay", pig_latinify("monster") == "onstermay"

def pig_latinify(string):
    # code
    return "place holder"

print("pig_latinify(\"hello\") == \"ellohay\": " + str(pig_latinify("hello") == "ellohay"))
print("pig_latinify(\"spy\") == \"spyay\": " + str(pig_latinify("spy") == "spyay"))

#   5
#   Define a method that finds all factors of n
#   return type: list
#   eg. factors(20) == [1, 2, 4, 5, 10, 20], factors(21) == [1, 3, 7, 21]

def factors(n):
    # code
    return "place holder"

print("factors(20) == [1, 2, 4, 5, 10, 20]: " + str(factors(20) == [1, 2, 4, 5, 10, 20]))
print("factors(21) == [1, 3, 7, 21]: " + str(factors(21) == [1, 3, 7, 21]))
print("factors(0) == []: " + str(factors(0) == []))

#   6
#   Define a method that finds the greatest common divisor of the numbers in l1
#   NOTE: The numbers in list l1 is in no particular order
#   return type: integer
#   eg. gcd([24, 32, 40]) == 8, gcd([0, 12, 13]) == 1

def gcd(l1):
    # code
    return "place holder"

print("gcd([24, 40, 32]) == 8: " + str(gcd([24, 32, 40]) == 8))
print("gcd([12, 0, 13]) == 1: " + str(gcd([0, 12, 13]) == 1))
print("gcd([0, 12, 13]) == 1: " + str(gcd([0, 12, 13]) == 1))
print("gcd([296, 185, 555, 962]) == 37: " + str(gcd([296, 185, 555, 962]) == 37))

#   7
#   Define a method that checks if string1 is an anagram of string2
#   return type: boolean
#   HINT: Try using dictionary to count the number of letters
#   eg. is_anagram("atc", "cat") == True, is_anagram("iioctdyanr", "dictionary") == True

def is_anagram(string1, string2):
    # code
    return "place holder"

print("is_anagram(\"atc\", \"cat\") == True: " + str(is_anagram("atc", "cat") == True))
print("is_anagram(\"iioctdyanr\", \"dictionary\") == True: " + str(is_anagram("iioctdyanr", "dictionary") == True))
print("is_anagram(\"iiiimppsss\", \"Mississippi\") == False: " + str(is_anagram("iiiimppsss", "Mississippiy") == False))
print("is_anagram(\"atc\", \"Cat\") == True: " + str(is_anagram("atc", "cat") == True))
print("is_anagram(\"bdaatcczx\", \"Cat\") == True: " + str(is_anagram("atc", "cat") == True))
print("is_anagram(\"hELeaTnp\", \"ELePhanT\") == True: " + str(is_anagram("hELeaTnp", "ELePhanT") == True))

#   8
#   Define a method that finds the index position of target in list l1
#   If target not found return -1
#   return type: integer
#   eg. search(8, [-3, -1, 0, 5, 7, 8]) == 5, search(0, [-3, -1, 0, 5, 7, 8]) == 2

def search(target, l1):
    # code
    return "place holder"

print("search(8, [-3, -1, 0, 5, 7, 8]) == 5: " + str(search(8, [-3, -1, 0, 5, 7, 8]) == 5))
print("search(0, [-3, -1, 0, 5, 7, 8]) == 2: " + str(search(0, [-3, -1, 0, 5, 7, 8]) == 2))
print("search(21, [-3, -1, 0, 5, 7, 8]) == 2: " + str(search(21, [-3, -1, 0, 5, 7, 8]) == 2))
print("search(\"Boku\", [21, True, [\"Joey\", \"Boku\", \"mIchael\"], \"boku\", \"Boku\", False, None]) == 3: " + str(search("Boku", [21, True, ["Joey", "Boku", "mIchael"], "boku", "Boku", False, None]) == 3))
