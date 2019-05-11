Functional Interface ==> any Interface that has only one abstract function is known as a functional interface
<br>This interface can exist freely and passes around as long as it belongs to one of the Types defined in java.util.function

<br>Lambda Expression ==> 

<br>To add Functional support Java added a new package java.util.function
Any Functional interface can be passed around and treated as first class citizen as long as it can be assigned to the types defined in this package.
<br>
Broadly these types can be classified into following categories:

    1. Supplier  ()  -> return R
    2. Consumer  (T) -> return void
    3. Predicate (T) -> return boolean
    4. Function  (T) -> return R 
    5. Opertaor  (T) -> return T

These can be mixed and matched in following ways:
1. We can have their binary counterparts
2. We can also have their primitive counterparts