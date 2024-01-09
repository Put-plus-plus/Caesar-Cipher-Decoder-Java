## Description 
Caesar ciphers are simple substitution ciphers in which each letter in the text is replaced by a letter some fixed number of positions up or down the alphabet. The user can then in a swing GUI enter a text they’d like to decode and choose the number of step back or forward, and the decoded message appears in the window. In order to solve the problem of what to do at the begninig and end of the alphabet as would in a standard list, a circular list was built from scarch using the util package in Java. 

The `CircularList` class has an internal static `Node` class, and an `append_node()` method that allows for the creation of an circular list by appending `Node` objects. 'CircularList' also has a `create_alphabet()` method that calls `append_node()` so to create a circular list populated with the letters of the English alphabet. `CircularList` has a `shift_forward_letter()` `shift_backwards_letter()` which find the a letter some fixed number of positions up or down the alphabet for a given letter, and are called by the 'decode_word()' method which takes the user's input in terms of word to be decoded, the direction of the shift, and the number of steps. The `GraphicalCaesar` class for user interactions GUI in `main()` method, provided by the user word to be decoded, the direction of the shift, and the number of steps.








## Dependencies
* Microsoft Windows version 10.0.19045
* Java 18.0.2.1

## Execution
```java
// just run file?
```

## Animation
remember to add the link to the GIF, which I must also make sure to add to the repo, see stackoverflow 
