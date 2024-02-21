## Description 
Caesar ciphers are simple substitution ciphers in which each letter in the text is replaced by a letter some fixed number of positions up or down the alphabet. The user can then in a swing GUI enter a text they’d like to decode and choose the number of step back or forward, and the decoded message appears in the window. 

The `CaesarCipherDecoder` class has two methods: `decode()` and `main()`. `decode()` accepts a string to be decoded, and an integer that represents the number of places up or down the alphabet each character of the string is to be shifted. If a character is not in the standard English alphabet, the character is kept in the the decoded cipher as is (eg "ab c%4" with a shift of -1 is decoded "bc d%4"). `decode()` returns a string with the decoded cipher. The `main()` method launches a Swing window for the user to use to decode Caesar ciphers. The user is instructed to enter the cipher into a text area, select the desired shift from a drop down menu, and press a button for the decoded cipher to be presented to the user. 


## Dependencies
* Microsoft Windows 10.0.19045
* Java 18.0.2.1

## Execution
```java
// just run file?
```

## Animation - '' example
remember to add the link to the GIF, which I must also make sure to add to the repo, see stackoverflow 
