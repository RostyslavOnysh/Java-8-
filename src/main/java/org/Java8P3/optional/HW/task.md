* Finish the implementation of ***generateRandomOptional() and getOptionalValue()*** methods.

* ***generateRandomOptional()*** should return Optional that holds randomNumber value 
- if randomNumber is odd,
- or empty Optional - if randomNumber is even.

* ***getOptionalValue()*** should call generateRandomOptional(), 
receive the Optional and return its value. 
If there is no value present - it should throw NoSuchElementException.
