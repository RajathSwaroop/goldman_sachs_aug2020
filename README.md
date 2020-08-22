# goldman_sachs_aug2020

Project 1 - spring boot application to store and retreive longest palindromic subsbtring
Project 2 - Inverting a number after padding it to the nearest upper multiple of 8 bits.

Project1:
Spring boot application that takes json input with string as key on post request over rest api call and stores the longest palindromic substring, retreive it using get request.

To run the application change the username and password to you username and password of mysql in application.properties.
Run the spring boot application on eclipse, intelliJ

post request: localhost:8000/palindrome_checker/palindrome    with input being { "string":xxyyxx } in the body
get request: localhost:8000/palindrome_checker/longest_palindrome    to get the longest palindromic substring stored in the database

Note that get request has to be done only after a post request.


Project 2:
Java code to invert a given decimal number after padding it to the closest upper multiple of 8.

v1 - Code using Java built-in binarystring function to convert to binary and back to Integer.
v2 - Custom function to convert decimal number to binary string and invert the number

ex: 10 is represented as 1010 in binary and 00001010 in binary with padding to 8bit. 
Inverting this number 00001010 is 01010000 which is 80 in decimal.

to test use the following commands.

compile: javac goldmanQ2_2.java

run java main num1 num2 num3      (inputs are num1, num2, num3 can be any number of inputs)
