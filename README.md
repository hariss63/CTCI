# Cracking the Coding Interview

Exercises from the book [Cracking the Coding Interview, 6th edition](http://www.crackingthecodinginterview.com/)

##Index
* [Data Structures](#data-structures)
  * [Arrays and Strings](#arrays-and-strings)
  * [Linked Lists](#linked-lists)
  
## Data Structures
### Arrays and Strings
**[1.1 Is Unique:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/UniqueString.java)** Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

**[1.2 Check Permutation:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/CheckPermutation.java)** Given two strings, write a method to decide if one is a permutation of the other.

**[1.3 URLify:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/URLify.java)** Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)

**[1.4 Palindrome Permutation:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/PalindromePermutation.java)** Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

**[1.5 One Away:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/OneAway.java)** There are three types of edits that can be performed on strings: insert a character, remove a character and replace a character. Given two strings, write a function to check if they are within one edit of each other.

**[1.6 String Compression:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/StringCompression.java)** Implement a method to perform basic string compression using the counts of repeated characters. For example, the string `aabcccccaaa` would become `a2b1c5a3`. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z).

**[1.7 Rotate Matrix:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/RotateMatrix.java)** Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

**[1.8 Zero Matrix:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/ZeroMatrix.java)** Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

**[1.9 String Rotation:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Array_String/StringRotation.java)** Assume you have a method `isSubstring` which checks if one word is a substring of another. Given two strings, `s1` and `s2`, write code to check if `s2` is a rotation of `s1` using only once call to `isSubstring` (e.g., "`waterbottle`" is a rotation of "`erbottlewat`").

### Linked Lists
**[2.1 Remove Dups:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Linked_List/RemoveDuplicates.java)** Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

**[2.2 Return Kth to Last:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Linked_List/KthToLast.java)** Implement an algorithm to find the kth to last element of a singly linked list.

**[2.3 Delete Middle Node:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Linked_List/DeleteMiddleNode.java)** Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.


**[2.4 Partition:](https://github.com/munyari/CTCI/blob/master/Data_Structures/Linked_List/Partition.java)** Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x.
